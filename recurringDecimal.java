import java.util.HashMap;
public class recurringDecimal {
	//resulting digit need to be incrementally added!
    public String fractionToDecimal(int numerator, int denominator) {
        String solve = "";
        String sign= "";
        if(numerator==0)  return "0";
        //change to larger range to prevent overflow
        long num  = numerator;
        long den = denominator;
        //positive or negative
        if(num<0 && den<0)
        {
            num = num * (-1);
            den = den * (-1);
        }
        //cannot do that because -2147483648 cannot turn into 2147483648!!!!
        else if(num * den < 0) 
        {
            if(num>0) den=den * (-1);
            else num=num * (-1);
            sign="-";
        }
        // if no fraction
        if(num%den ==0) 
        {
            solve+=String.valueOf(num/den);
            return sign+solve;
        }
        //if has fraction
        else
        {
                HashMap<Long,Integer> map = new HashMap<Long,Integer>();
                int counter=0;
                //get remainder
                long remainder = num%den;
                //integer part
                String pattern = String.valueOf(num/den)+".";
                //fraction part
                while(!map.containsKey(remainder)&&remainder!=0)
               {
                	map.put(remainder,counter);
                	//get resulting digit
                	pattern=pattern+String.valueOf(remainder*10/den);
                    counter++;
                    remainder = (remainder *10) % den;
               }
                	//should not cast to int, it has highest number only 2147483647
                	//should get pattern each time a digit is calculated to avoid overflow in long
                		//String pattern = Long.toString((long) (numerator*Math.pow(10, counter)/denominator));
	                //add 0 ahead!not Necessary
	                	//int zeroCounter=0;
	                	//while(pattern.length()<=counter)
	                	//{
	                	//	pattern = "0" + pattern;
	                	//	zeroCounter++;
	                	//}
                    //finite fraction
                    if(remainder==0)
                    {
                	//String addDot = pattern.substring(0,pattern.length()-counter)+"."+ pattern.substring(pattern.length()-counter,pattern.length());
                	return sign+pattern;
                    }
                    //infinite fraction
	                else
	                {
	                
	                int startCirclePosition = map.get(remainder);//!!after this position, circle starts!
	                //int leftBracketPosition = startCirclePosition+zeroCounter;//not necessary, hashmap include 0's positions
	                //counter indicates total number of digits after dot  
	                String addBracket = pattern.substring(0,pattern.length()-counter+startCirclePosition)+"(" +pattern.substring(pattern.length()-counter+startCirclePosition,pattern.length())+")";
	                //String addDotRightBracket = addLeftBracket.substring(0,addLeftBracket.length()-counter-1)+"."+addLeftBracket.substring(addLeftBracket.length()-counter-1,addLeftBracket.length())+")";
	                return sign + addBracket;
	                }
        }
}
	
}
