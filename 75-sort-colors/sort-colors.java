class Solution {
    public void sortColors(int[] nums) {
       int no1=0;
       int no2=0;
       int no0=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0)no0++;
        else if(nums[i]==1)no1++;
        else no2++;
       } 
       for(int i=0;i<no0;i++){
        nums[i]=0;
       }
       for(int i=0;i<no1;i++){
        nums[i+no0]=1;
       }
       for(int i=0;i<no2;i++){
        nums[i+no1+no0]=2;
       }
        return;
    }
}