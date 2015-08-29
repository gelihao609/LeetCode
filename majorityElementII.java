import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
/*
 * used sorting for array, so nlogn time
 */
public class majorityElementII {
	public static List<Integer> majorityElement(int[] nums) {
        int num = nums.length/3;
        int[] result = new int[2];   
        List<Integer> finalArray = new ArrayList<Integer>();
        if(nums.length==0) return finalArray;
        if(nums.length==1)
        {
            finalArray.add(nums[0]);
            return finalArray;
        }
        if(nums.length==2)
        {
            if(nums[0]==nums[1])
            {
                finalArray.add(nums[0]);
                return finalArray;
            }
            else
            {
                finalArray.add(nums[0]);
                finalArray.add(nums[1]);
                return finalArray;
            }
        }
        Arrays.sort(nums);// here use dual-pivot quick sort, should have average nlogn time?
        for(int i=0;i<nums.length-(num);i++)
        {
            if(nums[i]==nums[i+num])
            {
                if(finalArray.size()==0)
                {
                    finalArray.add(nums[i]);
                }
                else if(finalArray.size()==1&&finalArray.get(0)!=nums[i])
                {
                	finalArray.add(nums[i]);
                }
            }
        }       
     return finalArray;
    }
	public static void main(String[] args) {
		int[] input = {0,-1,2,-1};
		majorityElement(input);
	}

}
