class Solution {
    public void rotate(int[] nums, int k) {
    //     k = k % nums.length;
    //     for(int i=0 ;i<k;i++){
    //         int last = nums[nums.length - 1];
    //         for(int j=nums.length-1;j>0;j--){
    //             nums[j]=nums[j-1];
    //         }
    //         nums[0] = last;
    //     }
    // }
    k=k%nums.length;
    reverse(nums,0,nums.length-1);
    reverse(nums,k,nums.length-1);
    reverse(nums,0,k-1);
    
    }
    private int[] reverse(int[] ans,int l, int h){
        while(l<h){
            int temp=ans[l];
            ans[l]=ans[h];
            ans[h]=temp;
            l++;
            h--;
        }
        return ans;

    }
}