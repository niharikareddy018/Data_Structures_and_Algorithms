class Solution {
    public boolean checkValidString(String s) {
        int low=0,high=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                 low++;
                 high++;
            }
            if(s.charAt(i)==')'){
                low--;
                high--;
            }
            if(s.charAt(i)=='*'){
                low--;
                high++;
            }
            low=Math.max(0,low);
        
        if(high<0) return false;
        }
        return low==0;
    }
}