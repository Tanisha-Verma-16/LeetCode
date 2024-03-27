class Solution {
    public int countKeyChanges(String s) {
        s = s.toUpperCase();
        int count = 0;
        
        for(int i = 1, j = 0; i < s.length();i++,j++)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                count += 1;
            }
        }
        return count;
    }
}
