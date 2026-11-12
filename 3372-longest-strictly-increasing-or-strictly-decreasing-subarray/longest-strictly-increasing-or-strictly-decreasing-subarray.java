class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i=0;
        int j=1;
        int max=1;
        while(j<nums.length){
         if(nums[j]<nums[j-1]){
            max=Math.max(max,j-i+1);
         }
         else i=j;

         j++;
        }
        i=0;
        j=1;
        int max2=1;
        while(j<nums.length){
         if(nums[j]>nums[j-1]){
            max2=Math.max(max2,j-i+1);
         }
         else i=j;

         j++;
        }
         return Math.max(max,max2);
    }
}