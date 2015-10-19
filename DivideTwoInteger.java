
public class DivideTwoInteger {
	//use long to to calculation beyond 2^31-1 
	// to make shift operation as long, use 1L instead of 1
	// largest int is 2147483647 and smallest is -2147483648
public int divide(int dividend, int divisor) {
	if(divisor == 0) return Integer.MAX_VALUE;
    if(dividend == 0) return 0; 
	long dividen = dividend;
    long diviso = divisor;
    boolean isPositive = true;
    //prevent -2147483648 convert to positive
    //if(dividend == Integer.MIN_VALUE && divisor == -1 ) return Integer.MAX_VALUE;
    if(dividen<0 && diviso <0) 
    	{
    		dividen = Math.abs(dividen);
    		diviso = Math.abs(diviso);
    	}
    else if (dividen>0 && diviso < 0 || dividen<0 && diviso>0)
    {
    	isPositive = false;
    	dividen = Math.abs(dividen);
    	diviso = Math.abs(diviso);
    }
    long result = 0;
    long shiftCount = 0;
    long diviso_agent = diviso;
    while(dividen>=diviso)
    {

	    //only addup not work, exceed time limit, use shift operation
	    while(dividen >= diviso_agent)
		    {
	    	diviso_agent=diviso_agent << 1;
	    	shiftCount++;	
		    }
    	dividen = dividen - (diviso_agent>>1);
	    if(shiftCount>1)//has not reach the neariest point
	    {
	    	result += 1L<<(shiftCount-1);
		    shiftCount = 0;
		    diviso_agent = diviso;
	    }
	    else 
	    	result++;
	    
    } 
    if(result>Integer.MAX_VALUE && isPositive) return  Integer.MAX_VALUE;
    if(isPositive) return (int)result;
    return (int)(-result);
    }
}
