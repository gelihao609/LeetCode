import java.util.ArrayList;


public class reverseInteger {
	public static int reverse(int x) {
        boolean isPositive=true;
        int returnValue=0;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        if(x<0)
        {
            x=x*(-1);
            isPositive=false;
        }
        while(x%10==0)
        {
            if(x!=0){
                x=x/10;
            }
            else return 0;
        }
        while(x>0)
           {
             digits.add(x%10);
             x=x/10;
           }
        for(int i=digits.size()-1; i>=0;i--)
        {
            returnValue += digits.get(i)*Math.pow(10,digits.size()-(i+1));
        }
        if(returnValue==2147483647) return 0;
        else
        {
            return isPositive?returnValue:returnValue*(-1);
        }
    }
	public static void main(String[] args) {
		reverse(1);
	}
}
