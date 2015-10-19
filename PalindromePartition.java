import java.util.List;
import java.util.ArrayList;

public class PalindromePartition {
	 public List<List<String>> partition(String s) {
	     //DFS   
		 ArrayList<List<String>> result = new ArrayList<List<String>>();
	        ArrayList<String> palindromeList = new ArrayList<String>();
	        DFS(result,palindromeList,s);
	        return result;
	    }
	    //two pointers together
	    public boolean isPalindrome(String s)
	    {
	        int left=0;
	        int right=s.length()-1;
	    	while(left<right)
	    	{
	    		if(s.charAt(left)!=s.charAt(right)) return false;
	    		left++;
	    		right--;
	    	}
	        return true;
	    }
	    public void DFS(ArrayList<List<String>> result, ArrayList<String> palindromeList, String s)
	    {
	    	int length = s.length();
	    	for(int i=1;i<=length;i++)
	    	{
	    		String subStr = s.substring(0,i);
	    		if(isPalindrome(subStr))
	    		{
	    			palindromeList.add(subStr);
	    			String restStr = s.substring(i);
	    			DFS(result,palindromeList,restStr);
	    			//used to go back a level each time DFS is finished
	    			palindromeList.remove(palindromeList.size()-1);
	    		}
	    	}
	    	//need to pass the value to the result array 
	    	if(length==0) result.add(new ArrayList<String>(palindromeList));
	    }
	    
	
}
