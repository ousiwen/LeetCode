class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if( (r*c) > (nums.length * nums[0].length)  || (r*c) < (nums[0].length*nums.length)){
            return nums;
        }
        int[][] reshapeMatrix=new int[r][c];
        int row=0;
        int coloum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if( coloum == c){
                    coloum=0;
                    row++;
                }
                reshapeMatrix[row][coloum]=nums[i][j];
                coloum++;
            }
        }
        return reshapeMatrix;
    }
    /*others
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    int n = nums.length, m = nums[0].length;
    if (r*c != n*m) return nums;
    int[][] res = new int[r][c];
    for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = nums[i/m][i%m];
    return res;
    */
}
}
