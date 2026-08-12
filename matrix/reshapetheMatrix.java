class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int[][] num=new int[r][c];
        int i=0;
        int j=0;
        while(i<mat.length && j<mat[0].length){
                for(int k=0;k<r;k++){
                    for(int l=0;l<c;l++){
                        num[k][l]=mat[i][j];

                        j++;

                    if(j==mat[0].length){
                        j=0;
                        i++;
                    }
                }
            }
        }
        return num;
    }
}