import java.util.HashMap;

public class SingleNumber {
	//cation about constructor of HashMap, no primitve types. And only can
	//return values not keys
	    public int singleNumber(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	            if(map.containsKey((nums[i]))) map.remove((Integer)nums[i]);
	            else map.put((Integer)nums[i],(Integer)nums[i]);
	        }
	        return (int) map.values().toArray()[0];
	    }
	
}
