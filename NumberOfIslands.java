
public class NumberOfIslands {
	//DFS 
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        int counter=0;
        for(int x=0;x<grid[0].length;x++)
        {
            for(int y=0;y<grid.length;y++)
            {
                if(grid[y][x]=='1') 
                {
                    DFS(grid,x,y);
                    counter++;
                }
            }
        }
        return counter;
    }
        //DFS
        private void DFS(char[][] g,int x, int y)
        {
            if(x<0||x>=g[0].length) return;
            if(y<0||y>=g.length) return;
            if(g[y][x]!='1') return;
            g[y][x]='x';
            DFS(g,x+1,y);
            DFS(g,x-1,y);
            DFS(g,x,y+1);
            DFS(g,x,y-1);
        }
}
