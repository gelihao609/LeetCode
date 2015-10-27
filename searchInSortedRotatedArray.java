
public class searchInSortedRotatedArray {
	public int search(int[] nums, int target) {
        //find the pivot
        if(nums.length==1) return nums[0]==target?0:-1;
		int pivotLocation=0;
        if(target<=nums[nums.length-1])
        {
            for(int i=nums.length-1;i>=1;i--)
            {
                if(nums[i]==target) return i;
                if(nums[i-1]==target) return i-1;
                
                if(nums[i]<nums[i-1]) 
            {
                pivotLocation = i;
                break;
            }
            }
        }
        if(target>=nums[0])
        {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==target) return i;
            if(nums[i+1]==target) return i+1;
            if(nums[i]>nums[i+1]) 
            {
                pivotLocation = i;
                break;
            }
        }
        }
        return -1;
    }
}
