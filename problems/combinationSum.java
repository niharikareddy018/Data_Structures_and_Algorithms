class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
          com(candidates,target,new ArrayList<>(),res,0); 
          return res;
    }
    static void com(int[] candidates,int target,List<Integer> temp,List<List<Integer>> res,int start){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            int num=candidates[i];
            if(num<=target){
                temp.add(num);
                com(candidates,target-num,temp,res,i); 
                temp.remove(temp.size()-1);
            }
        }
    }

}