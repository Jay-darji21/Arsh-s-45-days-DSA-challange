// 378. Kth smallest element in a sorted matrix
// Medium

import java.util.PriorityQueue;

class Solution {

    class MinHeapNode implements Comparable<MinHeapNode> {
        int value;
        int rowIndex;
        int colIndex;

        public MinHeapNode(int value, int rowIndex, int colIndex) {
            this.value = value;
            this.rowIndex = rowIndex;
            this.colIndex = colIndex;
        }

        @Override
        public int compareTo(MinHeapNode other) {
            return Integer.compare(this.value, other.value);
        }
    }

    public int kthSmallest(int[][] matrix, int k) {
        int rowCount = matrix.length;
        PriorityQueue<MinHeapNode> minHeap = new PriorityQueue<>();

        // Push the first element of each row into the minHeap
        for (int i = 0; i < Math.min(rowCount, k); i++) {
            minHeap.offer(new MinHeapNode(matrix[i][0], i, 0));
        }

        int numbersChecked = 0, smallestElement = 0;

        while (!minHeap.isEmpty()) {
            // Get the smallest element from the heap
            MinHeapNode current = minHeap.poll();
            smallestElement = current.value;
            numbersChecked++;

            // If we've checked k elements, return the kth smallest element
            if (numbersChecked == k) break;

            // If there is a next element in the current row, add it to the heap
            if (current.colIndex + 1 < matrix[current.rowIndex].length) {
                minHeap.offer(new MinHeapNode(
                    matrix[current.rowIndex][current.colIndex + 1],
                    current.rowIndex,
                    current.colIndex + 1
                ));
            }
        }

        return smallestElement;
    }
}