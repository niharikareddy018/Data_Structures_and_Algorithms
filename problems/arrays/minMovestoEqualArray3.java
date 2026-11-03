class Solution {
    public int minMoves(int[] nums) {
        int moves=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            moves+=nums[nums.length-1]-nums[i];
        }
        return moves;
    }
}