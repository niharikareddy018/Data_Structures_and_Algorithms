class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int count=0;
        int sum=0;
        int left=0;
        int max=nums[0];
        int j=0;
        while(left<nums.length){
         if(nums[left]>=max){
            max=nums[left];
            j=left;
         }
         left++;
        }
        count=j+1;
        int k=0;
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                k=i;
            }
        }
        sum=nums.length-k;
      return Math.min(
    Math.max(j, k) + 1,
    Math.min(
        nums.length - Math.min(j, k),
        Math.min(j, k) + 1 + nums.length - Math.max(j, k)
    )
);
    }
}