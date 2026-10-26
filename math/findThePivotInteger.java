class Solution {
    public int pivotInteger(int n) {
        int left=1;
        int right=n;
        int lSum=1;
        int rSum=n;
        while(left<right){
            if(lSum<rSum){
                left++;
                lSum+=left;
            }
            else{
                right--;
                rSum+=right;
            }
        }
        return lSum==rSum?left:-1;
    }
}