// GFG : Subtraction in LinkedList

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

// Definition for singly Link List Node

import java.math.BigInteger;

class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    public Node subLinkedList(Node head1, Node head2) {
        // code here
        int len1 = getLength(head1);
        int len2 = getLength(head2);
        
        if(len1<len2){
            head1 = padList(head1,len2-len1);
        }
        else if(len2 < len1){
            head2 = padList(head2,len1-len2);
        }
        
        BigInteger num1 = linkedListToBigInteger(head1);
        BigInteger num2 = linkedListToBigInteger(head2);
        BigInteger result = num1.subtract(num2).abs();
        
        return bigIntegerToLinkedList(result);
    }
    
    // Method for get the length
    private int getLength(Node head){
        int length = 0;
        Node temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    
    // Pad the linekdlist with leading zeros to make it of the given length
    private Node padList(Node head, int padding){
        Node dummy = new Node(0);
        Node curr = dummy;
        for(int i=0; i<padding ; i++){
            curr.next = new Node(0);
            curr = curr.next;
        }
        curr.next = head;
        return dummy.next;
    }
    
    // Convert a LinekdList to BigInteger
    private BigInteger linkedListToBigInteger(Node head){
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while(current != null){
            sb.append(current.data);
            current = current.next;
        }
        return new BigInteger(sb.toString());
    }
    
    // Convert a BigInteger to LinkedList
    private Node bigIntegerToLinkedList(BigInteger bigInt){
        String str = bigInt.toString();
        Node head = new Node(Character.getNumericValue(str.charAt(0)));
        Node current = head;
        for(int i=1; i<str.length() ; i++){
            current.next = new Node(Character.getNumericValue(str.charAt(i)));
            current = current.next;
        }
        
        return head;
    }
}
        
