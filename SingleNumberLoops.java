class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            boolean b = false;
            for(int j = 0; j < nums.length; j++)
            {
               if(nums[i] == nums[j] & i!=j)
               {
                    b = true;
                    break;
               } 
               
            }
            if (b == false)
            {
                res =  nums[i];
                
            }
        }
        return res;
    }
}
