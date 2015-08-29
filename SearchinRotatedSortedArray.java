/*
  Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 */
public class SearchinRotatedSortedArray {
	
	 public int search(int[] A, int target) {
	        int left = 0;
	        int right = A.length-1;
	        int middle = -1;
	        if (A.length%2!=0)
	        {
	           middle = (A.length-1)/2;
	        }
	        else
	        {
	            middle = A.length/2-1;
	        }
	        
	        if(target==A[middle])
	        return A[middle];
	        else if (target<A[middle]&&target>)
	        {
	            int[] B = new int[];
	            search();
	        }
	        
	    }

}
