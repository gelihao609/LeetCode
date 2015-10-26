import java.util.ArrayList;
import java.util.List;


public class CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        DFS(result,new ArrayList<Integer>(),k,n,1,0);
        return result;
    }
    
    private void DFS(List<List<Integer>> result,List<Integer> list, int k, int n,int num, int sum)//result,templist, requried number, required sum, current number, current sum
    {
        if(list.size()>k||sum>n) return;
        if(list.size()==k&&sum==n) result.add(new ArrayList<Integer>(list));
        else{
                for(int i=num;i<=9;i++)
                {
                    list.add(i);
                    DFS(result,list,k,n,i+1,sum+i);//input result,current list, total k total n, next number to add and current sum
                    list.remove(list.size()-1);
                }
        }
    }
}
