import java.util.ArrayList;

/*
 * cannot simply change into decimal and add, need to manually add
 */
public class addBinary {
	public static String add(String a, String b) {
        /*
		int totalDecimal=convert(a)+convert(b);
        ArrayList<Integer> digits = new ArrayList<Integer>();
        String result="";
        while(totalDecimal!=0)
        {
            digits.add(totalDecimal%2);
            totalDecimal=totalDecimal/2;
        }
        for(int i=digits.size()-1;i>=0;i--)
        {
            result+=digits.get(i);
        }
        return result;
    }
    public static int convert(String a){
        int total=0;
        for(int i=0;i<a.length();i++)
        {
            total+=(a.charAt(i)-'0')*Math.pow(2,a.length()-i-1);
        }
        return total;
        */
		if(a.equals("0")) return b;
		if(b.equals("0")) return a;
		String longString="";
		String shortString="";
		if(a.length()>b.length())
		{
			 longString=a;
			 shortString=b;
		}
		else
		{
			longString=b;
			shortString=a;
		}
		String rlongString=reverse(longString);
		String rshortString=reverse(shortString);	
		String result="";
		int[] resultArray = new int[rlongString.length()+1];
		int carray=0;
		for(int i=0;i<rshortString.length();i++)
		{	
			int total=(rshortString.charAt(i)-'0')+(rlongString.charAt(i)-'0')+carray;
			resultArray[i]=total%2;
			carray=total<2?0:1;		
		}
		for(int i=rshortString.length();i<rlongString.length();i++)
		{
			int total=(rlongString.charAt(i)-'0')+carray;
			resultArray[i]=total%2;
			carray=total<2?0:1;
		}
		if(carray==1)
		{
			resultArray[rlongString.length()]=1;
		}
		if(resultArray[resultArray.length-1]==1)
		{
			result="1";
		}
		for(int i=resultArray.length-2;i>=0;i--)
		{
			result+=resultArray[i];
		}
		
		return result;
    }
	
	public static String reverse(String str)
	{
		String output="";
		for(int i=str.length()-1;i>=0;i--)
		{
			output+=str.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
			add("1010","1011");
	}

}
