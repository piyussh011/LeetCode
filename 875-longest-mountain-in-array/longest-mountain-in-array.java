class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
           int max=0;
           for(int i=1;i<n-1;i++){
                    
                if(arr[i]>arr[i-1] &&arr[i+1]<arr[i]){
                    int l=i;
                    int h=i;
                
                   while(l>0 && arr[l]>arr[l-1]) l--;
                   while(h<n-1 && arr[h]>arr[h+1]) h++;

                max=Math.max(max,h-l+1);
                }
           }
           return max;
          

    //     int l=0;
    //     int h=arr.length-1;
    //     while(l<h){
    //        int mid=(l+h)/2;
    //         if(arr[mid]>arr[mid-1] &&arr[mid+1]<arr[i]) return 
    //     }
    }
}