class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int top = 0;
        int bottom = matrix.length;
        int rt = matrix[0].length;
        int lt = 0;
        int max = matrix.length* matrix[0].length;

        while(top < bottom && lt < rt)
        {
            for (int i = lt; i < rt; i++)
            {
                res.add(matrix[top][i]);
            }
            top++;
            if (max == res.size()) 
            {
                break;
            }
            for (int i = top; i < bottom; i++)
            {
                res.add(matrix[i][rt-1]);
            }
            rt--;
            if (max == res.size()) 
            {
                break;
            }
            for (int i= rt - 1; i > lt-1; i--)
            {
                res.add(matrix[bottom-1][i]);
            }
            bottom--;
            if (max == res.size()) 
            {
                break;
            }
            for (int i = bottom -1; i > top-1; i--)
            {
                res.add(matrix[i][lt]);
            }
            lt++;
            if (max == res.size()) 
            {
                break;
            }
        }
        return res;
    }
}
