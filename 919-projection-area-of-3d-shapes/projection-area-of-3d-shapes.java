class Solution {
    public int projectionArea(int[][] grid) {
        int n=grid.length;
        int area=0;
        for(int i=0;i<n;i++){
            int rowmax=0;

            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    area++;
                }
                rowmax=Math.max(grid[i][j], rowmax);
            }
            area=area+rowmax;

            
        }
        for(int j=0;j<n;j++){
            int colmax=0;
            for(int i=0;i<n;i++){
                colmax=Math.max(grid[i][j],colmax);
            }
            area=area+colmax;
        }
        return area;
        
    }
}