// GFG : Multiply the LinkedList

// TimeComplexity : O(n)
// SpaceComplexity : O(1)

public long multiplyTwoLists(Node first, Node second) {
    if (first == null || second == null) return 0;
  
    long a = 0;
    long b = 0;
  
    while (first != null) {
      a = (a * 10) % 1000000007 + first.data;
      first = first.next;
    }
  
    while (second != null) {
      b = (b * 10) % 1000000007 + second.data;
      second = second.next;
    }
  
    return (a * b) % 1000000007;
  }
  