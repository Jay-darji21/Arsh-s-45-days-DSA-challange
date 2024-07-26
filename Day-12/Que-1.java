// 430. Flatten a doubly level LinkedList
// Medium

// TimeComplexity : O(n)
// SpaceComplexity : O(1)


// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};


class Solution {
    public Node flatten(Node head) {
        flat(head);
        return head;
    }

    public Node flat(Node head){
        Node curr = head;
        Node last = head;
        while(curr!=null){
            if(curr.child != null){
                // If node have the child node
                Node midTail = flat(curr.child);
                
                // Store the next element
                Node next = curr.next;
                if(next!=null){
                    // Connection between curr node and child node
                    midTail.next = next;
                    next.prev = midTail;
                }

                curr.next = curr.child;
                curr.child.prev = curr;

                // Make the child node null
                curr.child = null;

                curr=midTail;
            }

            last = curr;
            curr = curr.next;
        }

        return last;
    }
}