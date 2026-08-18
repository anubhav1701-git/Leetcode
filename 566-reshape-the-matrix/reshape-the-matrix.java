class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int n = mat.length;
        int m = mat[0].length;

        int totalElement = n * m;
        int totalElementNew = r * c;

        if (totalElement != totalElementNew) {
            return mat;
        }

        int[][] reshape = new int[r][c];

        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                reshape[index / c][index % c] = mat[i][j];

                index++;
            }
        }

        return reshape;
    }
}