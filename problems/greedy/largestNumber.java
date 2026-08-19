class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(a,b)->{
            return (b+a).compareTo(a+b);
        });
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder s=new StringBuilder();
        for(String num:str){
            s.append(num);
        }
        return s.toString();
    }
}