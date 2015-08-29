
public class BestTimeToBuyAndSellStock {
	    /** Use DP. 
	     *  get the first price as the min cost. And the maxProfit = 0. 
	     *  profit is based on min cost, so we first see the first element as sell price, among the subarray (with only one element), 
	     *  we get the profit, if its larger than current maxProfit, then update. Then we compare the min cost in this subarray. If 
	     *  current cost is smaller, take is as the current subarray's min cost.
	     *  Step.1: in [...En] subarray, we have our min cost and max profit.
	     *  Step.2: when E(n+1) come, we get the profit based on our old min cost. If larger, then it becomes new max.
	     *  Step.3: if E(n+1) is smaller than the current min cost, then it becomes new min.
	     *  Step.4: iterate all elements in the array and repeat from step.1
	     **/
	     /* to much time complexity
	    public int maxProfit(int[] prices) {
	        int max=0;
	        for(int buyDay=0;buyDay<prices.length-1;buyDay++)
	        {
	            for(int sellDay=buyDay+1;sellDay<prices.length;sellDay++) 
	            {
	                if(prices[buyDay]<prices[sellDay])
	                {
	                    int profit=prices[sellDay]-prices[buyDay];
	                    if(max<profit)
	                    {
	                        max=profit;
	                    }
	                }
	            }
	        }
	        return max;
	    }
	    */
	    public static int maxProfit(int[] prices) {
	        if(prices.length<=1) 
	        {
	            return 0;
	        }
	        int maxProfit=0;
	        int minCost=prices[0];
	        for(int i=0;i<prices.length;i++)
	        {
	            int newProfit=prices[i]-minCost;
	            if(newProfit>maxProfit)//first comsider the new element as sell price 
	            {
	                maxProfit=newProfit;
	            }
	            if(prices[i]<minCost)//then consider the new element as buy price to prepare for the next coming element
	            {
	                minCost=prices[i];
	            }
	        }
	        return maxProfit;	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
