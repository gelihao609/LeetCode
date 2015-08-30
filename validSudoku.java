import java.util.Hashtable;


public class validSudoku {
	public static boolean isValidSudoku(char[][] board) {
        int length=board.length;
        if(length!=9) return false;
        //check rows
        for(int row=0; row<length;row++)
        {
            Hashtable lookupTable = new Hashtable(length*2);
            for(int i=0;i<length;i++)
            {
                if(lookupTable.containsKey(board[row][i])&&board[row][i]!='.') return false;
                if(board[row][i]!='.')
                {
                    lookupTable.put(board[row][i],i);
                }
            }
        }
        //check columns
        for(int column=0; column<length;column++)
        {
            Hashtable lookupTable = new Hashtable(length*2);
            for(int i=0;i<length;i++)
            {
                if(lookupTable.containsKey(board[i][column])&&board[i][column]!='.') return false;
                if(board[i][column]!='.')
                {
                    lookupTable.put(board[i][column],i);
                }
            }
        }
        //check 9-slice-subarrays
        int subLength=length/3;
        for(int subnum=0;subnum<length;subnum+=3)
        {
            Hashtable lookupTable = new Hashtable(length*2);
          for(int i=0;i<subLength;i++)
          {
              if(lookupTable.containsKey(board[0+subnum][i])&&board[0+subnum][i]!='.') return false;
              if(lookupTable.containsKey(board[1+subnum][i])&&board[1+subnum][i]!='.') return false;
              if(lookupTable.containsKey(board[2+subnum][i])&&board[2+subnum][i]!='.') return false;

              if(board[0+subnum][i]!='.') lookupTable.put(board[0+subnum][i],i);
              if(board[1+subnum][i]!='.') lookupTable.put(board[1+subnum][i],i);
              if(board[2+subnum][i]!='.') lookupTable.put(board[2+subnum][i],i);
          }
        }
        for(int subnum=0;subnum<length;subnum+=3)
        {
            Hashtable lookupTable = new Hashtable(length*2);
          for(int i=0;i<subLength;i++)
          {
              if(lookupTable.containsKey(board[0+subnum][i+subLength])&&board[0+subnum][i+subLength]!='.') return false;
              if(lookupTable.containsKey(board[1+subnum][i+subLength])&&board[1+subnum][i+subLength]!='.') return false;
              if(lookupTable.containsKey(board[2+subnum][i+subLength])&&board[2+subnum][i+subLength]!='.') return false;

              if(board[0+subnum][i+subLength]!='.') lookupTable.put(board[0+subnum][i+subLength],i+subLength);
              if(board[1+subnum][i+subLength]!='.') lookupTable.put(board[1+subnum][i+subLength],i+subLength);
              if(board[2+subnum][i+subLength]!='.') lookupTable.put(board[2+subnum][i+subLength],i+subLength);
          }
        }
        for(int subnum=0;subnum<length;subnum+=3)
        {
            Hashtable lookupTable = new Hashtable(length*2);
          for(int i=0;i<subLength;i++)
          {
              if(lookupTable.containsKey(board[0+subnum][i+2*subLength])&&board[0+subnum][i+2*subLength]!='.') return false;
              if(lookupTable.containsKey(board[1+subnum][i+2*subLength])&&board[1+subnum][i+2*subLength]!='.') return false;
              if(lookupTable.containsKey(board[2+subnum][i+2*subLength])&&board[2+subnum][i+2*subLength]!='.') return false;

              if(board[0+subnum][i+2*subLength]!='.') lookupTable.put(board[0+subnum][i+2*subLength],i+2*subLength);
              if(board[1+subnum][i+2*subLength]!='.') lookupTable.put(board[1+subnum][i+2*subLength],i+2*subLength);
              if(board[2+subnum][i+2*subLength]!='.') lookupTable.put(board[2+subnum][i+2*subLength],i+2*subLength);
          }
        }
        
        return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
