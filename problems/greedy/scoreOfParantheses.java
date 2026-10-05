class Solution {
    public int scoreOfParentheses(String s) {
        int low=0;
        int high=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                low++;
            }else{
                low--;
                if(s.charAt(i-1)=='('){
                   high+=1<<low;
                }
            }
        }
       return high;
    }
}