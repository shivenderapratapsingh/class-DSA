public class Question15 {
   
        public int kthSmallest(int[][] matrix, int k) {
            int R = matrix.length;
            int C = matrix[0].length;
            int start = matrix[0][0];
            int end = matrix[R - 1][C - 1];
    
            while (start <= end) {
                int assumedKthElement = start + (end - start) / 2;
                int smallerElements = findSmallerElements(matrix, assumedKthElement);
    
                if (smallerElements <= k - 1) {
                    start = assumedKthElement + 1;
                } else {
                    end = assumedKthElement - 1;
                }
            }
            return start;
        }
    
        private int findSmallerElements(int[][] matrix, int assumedKthElement) {
            int noOfSmallerElements = 0;
            
            for (int i = 0; i < matrix.length; i++) {
                int start = 0;
                int end = matrix[i].length - 1;
    
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (matrix[i][mid] <= assumedKthElement) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                noOfSmallerElements += start;
            }
            return noOfSmallerElements;
        }
    }
    

