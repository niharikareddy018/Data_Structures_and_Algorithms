class Solution {
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};

    public int shortestBridge(int[][] grid) {
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();

        boolean found=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,q);
                    found=true;
                    break;
                }
            }
            if(found) break;
        }

        int distance=0;

        while(!q.isEmpty()){
            int size=q.size();

            while(size-->0){
                int[] cur=q.poll();
                int r=cur[0];
                int c=cur[1];

                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];

                    if(nr<0||nc<0||nr>=n||nc>=n||grid[nr][nc]==2)
                        continue;

                    if(grid[nr][nc]==1)
                        return distance;

                    grid[nr][nc]=2;
                    q.offer(new int[]{nr,nc});
                }
            }

            distance++;
        }

        return -1;
    }

    void dfs(int[][] grid,int r,int c,Queue<int[]> q){
        int n=grid.length;

        if(r<0||c<0||r>=n||c>=n||grid[r][c]!=1)
            return;

        grid[r][c]=2;
        q.offer(new int[]{r,c});

        for(int[] d:dir){
            dfs(grid,r+d[0],c+d[1],q);
        }
    }
}