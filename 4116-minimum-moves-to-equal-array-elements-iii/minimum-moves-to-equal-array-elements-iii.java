class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
           while(nums[i]!=max) {
            nums[i]+=1;
            count++;
           }
        }
        return count;
    }
}