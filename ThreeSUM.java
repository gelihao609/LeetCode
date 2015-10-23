import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ThreeSUM {
	 public List<List<Integer>> threeSum(int[] nums) {
	        Map<String,List<Integer>> resultSet = new HashMap<String,List<Integer>>();
	        if(nums.length<=2) return new ArrayList<List<Integer>>(resultSet.values());
	        if(nums.length==3) 
	        {
	            if(nums[0]+nums[1]+nums[2]==0) 
	            {
	                resultSet.put(arrangeToList(nums).toString(),arrangeToList(nums));
	            }
	        }
	        else
	        {
	            Arrays.sort(nums);
	            int len=nums.length;
	            for(int index=0;index<len-2;index++)
	            {
	                if(index>1&&nums[index]==nums[index-1]) continue; //optimization 1; skip same characters
	                if(nums[index]+nums[index+1]+nums[index+2]>0) continue;//optimization 2: skip the one that can never get to the target
	                if(nums[len-1]+nums[len-2]+nums[len-3]<0) continue;//optimization 2: skip the one that can never get to the target
	                int startP = index+1;
	                int endP = len-1;
	                while(startP<endP)
	                {
	                    if(nums[startP]+nums[endP]+nums[index]>0) endP--;
	                    else if(nums[startP]+nums[endP]+nums[index]<0) startP++;
	                    else
	                    {
	                        ArrayList<Integer> arr=new ArrayList<Integer>();
	                        arr.add(nums[index]);
	                        arr.add(nums[startP]);
	                        arr.add(nums[endP]);
	                        String key=arr.toString();
	                        if(!resultSet.containsKey(key))
	                        {
	                        resultSet.put(key,arr);
	                        }
	                        startP++;
	                    }
	                }
	            }
	        }
	        return new ArrayList<List<Integer>>(resultSet.values());
	    }
	    private ArrayList<Integer> arrangeToList(int[] num){
	        Arrays.sort(num);
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        result.add(num[0]);
	        result.add(num[1]);
	        result.add(num[2]);
	        return result;
	    }
}
