class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[minIndex] > nums[j])
                {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
