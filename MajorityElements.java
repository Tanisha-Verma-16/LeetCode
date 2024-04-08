class Solution {
    public int majorityElement(int[] nums) {
        int mid = (nums.length - 1)/2;
        mergeSort(nums, 0 , nums.length - 1);
        return(nums[mid]);
    }
    public void mergeSort(int[] arr, int s,int e)
    {
        if (s >= e)
        {
            return;
        }
        int mid = (s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }
    public void merge(int[] arr, int s,int mid ,int e)
    {
        int[] temp = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= e)
        {
            if (arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++; 
        }
        while (i <= mid)
        {
            temp[k] =  arr[i];
            i++; k++;
        }
        while (j <= e)
        {
            temp[k] =  arr[j];
            j++; k++;
        }
        for(int x = s, y = 0; y < temp.length; x++,y++)
        {
            arr[x] = temp[y];
        }
    }
}
