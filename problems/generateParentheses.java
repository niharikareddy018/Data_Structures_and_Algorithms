class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        generate(l,new StringBuilder(),0,0,n);
        return l;
    }
    static void generate(List<String> l,StringBuilder temp,int open,int close,int max){
        if(temp.length()==2*max){
            l.add(temp.toString());
            return;
        }
        if(open < max){
            temp.append('(');
             generate(l,temp,open+1,close,max);
             temp.deleteCharAt(temp.length()-1);
        }
        if(close<open){
            temp.append(')');
            generate(l,temp,open,close+1,max);
            temp.deleteCharAt(temp.length()-1);
        }
    }

}