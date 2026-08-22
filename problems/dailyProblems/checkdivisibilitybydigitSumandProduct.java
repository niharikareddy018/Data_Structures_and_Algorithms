class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum=0;
        int digitProd=1;
        int temp=n;
        while(n>0){
            int res=n%10;
            digitSum+=res;
            digitProd*=res;
            n=n/10;
        }
        int sum=digitSum+digitProd;
        if(temp%sum==0){
            return true;
        }
        return false;
    }
}