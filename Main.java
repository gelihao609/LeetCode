import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
	public static void change(int[] num){
		num[0]=num[1];
	}

	public static void main(String[] args) {
     // SingleNumber sn = new SingleNumber();
     // int[] list = {1};
     // sn.singleNumber(list);
	//	recurringDecimal r = new recurringDecimal();
	//	String x = r.fractionToDecimal(-1, -2147483648);
	//	System.out.print(x);
		//DivideTwoInteger dt = new DivideTwoInteger();
		//System.out.print(dt.divide(-2147483648, 1));
		//System.out.print((1L<<31));
		//PalindromePartition p = new PalindromePartition();
		//System.out.println(p.partition("aba").toString());
		//medianInTwoSortedArray m = new medianInTwoSortedArray();
		int[] num = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		
		//int[] nums2 = {3,4,5,1,2};
		//System.out.println(m.findMedianSortedArrays(nums1, nums2));
		//gasStation g = new gasStation();
		//System.out.println(g.canCompleteCircuit(nums1, nums2));
		//change(nums1);
        //Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
       // ArrayList<Integer> result = new ArrayList<Integer>();
       // result.add(num[0]);
       // result.add(num[1]);
       // result.add(num[2]);
       // resultSet.add(result);
        //ArrayList<List<Integer>> resultList = new ArrayList<List<Integer>>(resultSet);
        //int[] result ={num[0],num[1]};
		//System.out.println(Arrays.toString(result));
		ThreeSUM s = new ThreeSUM();
		System.out.println(s.threeSum(num).toString());
	}

}
