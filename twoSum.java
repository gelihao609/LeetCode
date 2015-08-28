import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
	
    public static int[] twoSum(int[] numbers, int target) {
    	/**
    	 * HashMap is non synchronized and not thread safe, HashTable is.
    	 * HashMap allows one null key and any number of null values, while HashTable do not allow null keys and null values   	 * 
    	 */
    	/*
    	HashMap<Integer,Integer> map=new HashMap<Integer, Integer>(numbers.length*2);
        int[] solution = new int[2];
        int com;
        int j=0;
        for(int i=0; i<numbers.length;i++)
            {
            if (map.containsKey(target-numbers[i]))//hit some key in the hashMap 
                {
            		solution[0] = map.get(target-numbers[i])+1;//since the number in the map has the indice smaller than the current number, its indice is put ahead
            		solution[1] = i+1;
            		break;
                }
            else{
                map.put(numbers[i],i);//If the number is not found in hashmap, put numbers as key and indices as value
            }
            }
            return solution;
    	 */
    	
    	/*************************** 2nd *****************/
    	
    	/**
    	 * first sort array and find the two numbers in the sorted array
    	 * go back to the original array and find indexes
    	 */
    	int[] sorted = new int[numbers.length];
    	System.arraycopy(numbers,0,sorted,0,numbers.length);
        Arrays.sort(sorted);
        int startIndex = 0;
        int endIndex = numbers.length-1;
        while(startIndex<endIndex){
        	if(sorted[startIndex]+sorted[endIndex]<target){
        		startIndex++;
        		continue;
        	}
        	else if(sorted[startIndex]+sorted[endIndex]>target){
        		endIndex--;
        		continue;
        	}
        	else break;//find startIndex and endIndex
        }
        int number1=sorted[startIndex];
        int number2=sorted[endIndex];
        int index1=-1;
        int index2=-1;
        int[] result=new int[2];
        for(int i=0;i<numbers.length;i++){
        	if(numbers[i]==number1||numbers[i]==number2){
        		if(index1==-1)	
        		index1=i+1;
        		else
        		index2=i+1;
        		}
        	}
        //put in the result array
        if(index1<index2){       	
        result[0]=index1;
        result[1]=index2;
        }
        else
        {
            result[0]=index2;
            result[1]=index1;
        }
        return result;
        }
    
    public static void main(String[] args){
    	int[] num = {3,2,4};
    	twoSum(num, 5);
    }
    
}