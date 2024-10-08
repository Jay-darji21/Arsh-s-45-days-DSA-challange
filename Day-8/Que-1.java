// GFG : Max Rectangle

// TimeComplexity : O(n^2)
// SpaceComplexity : O(n)

import java.util.Stack;

class Solution{


static int maxHist(int R, int C, int row[])
    {
        // Create an empty stack. The stack holds indexes of
        // hist[] array/ The bars stored in stack are always
        // in increasing order of their heights.
        Stack<Integer> result = new Stack<Integer>();

        int top_val; // Top of stack

        int max_area = 0; // Initialize max area in current
        // row (or histogram)

        int area = 0; // Initialize area with current top

        // Run through all bars of given histogram (or row)
        int i = 0;
        while (i < C) {
            // If this bar is higher than the bar on top
            // stack, push it to stack
            if (result.empty()
                || row[result.peek()] <= row[i])
                result.push(i++);

            else {
                top_val = row[result.peek()];
                result.pop();
                area = top_val * i;

                if (!result.empty())
                    area
                        = top_val * (i - result.peek() - 1);
                max_area = Math.max(area, max_area);
            }
        }

        
        while (!result.empty()) {
            top_val = row[result.peek()];
            result.pop();
            area = top_val * i;
            if (!result.empty())
                area = top_val * (i - result.peek() - 1);

            max_area = Math.max(area, max_area);
        }
        return max_area;
    }

    
    static int maxRectangle(int R, int C, int A[][])
    {
        
        int result = maxHist(R, C, A[0]);

        // iterate over row to find maximum rectangular area
        // considering each row as histogram
        for (int i = 1; i < R; i++) {

            for (int j = 0; j < C; j++)

                // if A[i][j] is 1 then add A[i -1][j]
                if (A[i][j] == 1)
                    A[i][j] += A[i - 1][j];

            // Update result if area with current row (as
            // last row of rectangle) is more
            result = Math.max(result, maxHist(R, C, A[i]));
        }

        return result;
    }
}