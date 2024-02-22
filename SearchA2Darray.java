class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;

        while(start <= end)
        {
            int mid = (start + end)/2;
            int rowidx = mid/matrix[0].length;
            int colidx = mid % matrix[0].length;

            if (matrix[rowidx][colidx] == target)
            {
                return true;
            }
            else if (matrix[rowidx][colidx] < target)
            {
                start = mid + 1;
            }
            else 
            {
                end = mid - 1;
            }

        }
        return false;
        
}
}
