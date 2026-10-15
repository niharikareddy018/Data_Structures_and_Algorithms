class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
            Arrays.sort(nums);
            int[] res=new int[nums.length];
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                  set.add(nums[i]);
            }
            for(int i=0;i<nums.length;i++){
                res[i]=i+1;
                if(!set.contains(res[i])){
                   list.add(res[i]);
                }
            }
        return list;
    }
}