public class SpiralMatrixPrinter {

    // Function to print matrix in spiral form
    static void spiralPrint(int rows, int columns, int matrix[][]) {
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        while (top <= bottom && left <= right) {
            // Print the top row
            for (int i = left; i <= right; ++i) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print the rightmost column
            for (int i = top; i <= bottom; ++i) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print the bottom row if it exists
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print the leftmost column if it exists
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Function Call
        spiralPrint(rows, columns, matrix);
    }
}
