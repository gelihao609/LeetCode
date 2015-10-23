
public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	  /* brute force
        int flag=0;
        for(int startIndex=0;startIndex<gas.length;startIndex++)
        {
            int total = 0;
            for(int i=startIndex;i<gas.length;i++)
            {
                
                if(total+gas[i]<cost[i]) 
                {
                    flag=-1;
                    break;
                }
                total+=gas[i]-cost[i];
            }
            if(flag!=-1)
            {
                for(int i=0;i<startIndex;i++)
                {
                    if(total+gas[i]<cost[i]) 
                    {
                        flag=-1;
                        break;
                    }
                    total+=gas[i]-cost[i];
                }
                if(flag!=-1)
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                return startIndex;
            }
        }
        return -1*/
        //corner case length=1
        if(gas.length==1) return gas[0]>=cost[0]?0:-1;
        int[] delta = new int[gas.length];
        int balance = 0;
        int startNode = 0;
        int total = 0;
        //from 0 to n-1 elements, if accumulated balance is zero, then this cannot be the head, so consider the next as head
        //if we have move to the last element as proposed startNode, then we need sum of all deltas, if not <0 then, the lastNode can be head
        for(int i=0;i<gas.length;i++)
        {
            delta[i] = gas[i]-cost[i];
            total+=delta[i];//used when we reach the last element, just need to get total, if total balance >0 then, it is fine
            balance +=delta[i];
                if(i<gas.length-1&&balance<0)
                {
                    startNode = i+1;//because only unique answer, so if there is an answer, this value should be changed n-1 times
                    balance = 0;//restart from i+1
                }
        }
        if(balance<0||total<0) return -1;
        else return startNode;
    }
}
