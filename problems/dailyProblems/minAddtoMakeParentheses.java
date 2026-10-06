class Solution {
    public int minAddToMakeValid(String s) {
        int min=0;
        int neg=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                min++;
            }else if(s.charAt(i)==')'){
                min--;
            }
            if(min<0){
                neg++;
                min=0;
            }
        }
        return neg+min;
    }
}