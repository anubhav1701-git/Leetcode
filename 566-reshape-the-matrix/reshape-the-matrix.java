class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int index=0;
        int [][] reshape= new int[r][c];
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            reshape[index/c][index%c]=mat[i][j];
            index++;
        }
        }
        return reshape;
    }
}

