class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
         
        int[] ans=new int[2];
         ans[0]=-1;
         ans[1]=-1;
       
        if(n<1) return ans;
        
        int low=0;
        int hig=n-1;
        while(low<=hig){
            int mid=(low+hig)/2;
            if(nums[mid]==target) {
                ans[0]=mid;
                hig=mid-1;
                // if(nums[mid-1]==target) ans[1]=mid-1;
                // else if(nums[mid+1]==target) ans[1]=mid+1;
            }
            else if(nums[mid]<target) low=mid+1;
            else hig=mid-1;
        }
        low=0;
        hig=n-1;
        while(low<=hig){
            int mid=(low+hig)/2;
            if(nums[mid]==target) {
                ans[1]=mid;
                low=mid+1;
                // if(nums[mid-1]==target) ans[1]=mid-1;
                // else if(nums[mid+1]==target) ans[1]=mid+1;
            }
            else if(nums[mid]<target) low=mid+1;
            else hig=mid-1;
        }
       return ans;

    }
}