// GFG : Sort the LinkedList contains 0s,1s and 2s

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}


class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        int count[] = {0,0,0};
        Node ptr = head;
        
        while(ptr!=null){
            count[ptr.data]++;
            ptr=ptr.next;
        }
        
        int i=0;
        ptr = head;
        
        while(ptr != null){
            if(count[i]==0){
                i++;
            }
            else{
                ptr.data = i;
                --count[i];
                ptr = ptr.next;
            }
        }
        
        return head;
    }
}