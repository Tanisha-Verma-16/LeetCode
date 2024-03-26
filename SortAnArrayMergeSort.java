class Solution {
    public int[] sortArray(int[] nums) {
       
        mergesort(nums, 0, nums.length - 1);
    return nums;
    }
    public static void mergesort(int[] nums,int s, int e)
    {
        if (s >= e)
        {
            return;
        }
        int mid =s +  (e - s)/2;
        mergesort(nums,s,mid);
        mergesort(nums,mid+1,e);
        merge(nums,s,mid,e);
    }
    public static void merge(int[] nums,int s,int mid, int e)
    {
        int[] temp = new int[e - s +1];
        int i = s, j = mid + 1, k = 0;

        while(i <= mid && j <= e)
        {
            if (nums[i] < nums[j])
            {
                temp[k] = nums[i];
                i++;
            }
            else
            {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = nums[i];
            k++;i++;
        }
        while (j <= e)
        {
            temp[k] = nums[j];
            k++;j++;
        }

        for(int a = s, b = 0; b < temp.length; b++,a++)
        {
            nums[a] = temp[b];
        }
    }
}
