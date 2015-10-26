import java.util.ArrayList;
import java.util.List;


public class GreyCode {
    public List<Integer> grayCode(int n) {
    	//it is important to get to know the rules in Greycode
    	//which is 1st. add zero, 2nd, reverse list change zero to ones, then, parseInt(string,2)
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(n==0) {list.add(0); return list;}
        if(n>32) return null;
        if(n==1)
        {
            list.add(0);
            list.add(1);
            return list;
        }
        //n>1
        ArrayList<String> seeds=new ArrayList<String>();
        seeds.add("0");
        seeds.add("1");
        for(int i=2;i<n+1;i++)
        {
            int length=(int)Math.pow(2,i);
            for(int index=0;index<length/2;index++)
            {
                int delt;
                //add zeros
                seeds.set(index,"0"+seeds.get(index));
            }
            //add ones 
            for(int ri=seeds.size()-1;ri>=0;ri--)
            {
            	seeds.add("1"+seeds.get(ri).substring(1));
            }
        }
        //parse String to int
        for(int i=0;i<seeds.size();i++)
        {
            list.add(Integer.parseInt(seeds.get(i),2));//parse binary string to decimal int
        }
        return list;
    }
}
