// 138. Copy List with random pointer
// Medium

// TimeComplexity : O(n)
// SpaceComplexity : O(1)


// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        // Step 1 : Insert the new nodes between current nodes
        Node curr = head;
        
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        //Step 2 Copy the random pointer

        curr = head;
        while(curr != null){
            if(curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        // Step 3 : Separate the list

        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;
        while(curr != null){
            curr.next = newCurr.next;
            curr = curr.next;
            if(curr!=null){
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }
        
        return newHead;   
    }

}