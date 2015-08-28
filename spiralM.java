import java.util.List; 
public class spiralM {
	public static int[][] generateMatrix(int n){ 
		if(n==1) 
			{
			int[][] result = {{1}};
			return  result;
			}
		if(n==2)
		{
			int[][] result = {{1,2},{4,3}};
			return  result;
		}
		
			int[][] result = new int[n][n];
			int totalLayer=n%2==0?n/2:(n+1)/2;			
			int num=1;
			
			for(int layer=0;layer<totalLayer-1;layer++){
				int topLength=n-layer*2;
				//top's row
				for(int row=layer;row<topLength+layer;row++)
				{
					result[layer][row]=num;
					num++;
				}
				//right's column
				for(int column=layer+1;column<topLength+layer;column++)
				{
					result[column][topLength-1+layer]=num;
					num++;
				}
				//bottom's row
				for(int row=topLength-2+layer;row>=layer;row--)
				{
					result[topLength-1+layer][row]=num;
					num++;
				}
				//left's column
				for(int column=topLength-2+layer;column>=layer+1;column--)
				{
					result[column][layer]=num;
					num++;
				}	
		}
			//for the last layer, put 4-number square
			if(n%2==0)
			{
				result[n/2-1][n/2-1]=num;
				result[n/2-1][n/2]=num+1;
				result[n/2][n/2]=num+2;
				result[n/2][n/2-1]=num+3;
			}
			//fill center hole for odd n		
			else
			{
				result[(n+1)/2-1][(n+1)/2-1]=n*n;
			}		
			return result;
	}               
			                

	public static void main(String[] args) {
		generateMatrix(4);
	}

}
