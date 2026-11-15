class Solution {
    public int numOfSubarrays(int[] arr) {

               int even = 1;
        int odd = 0;
        int sum = 0;
        int count = 0;
        int mod = 1000000007;

        for(int num : arr) {

            sum += num;

            if(sum % 2 == 0) {
                count = (count + odd) % mod;
                even++;
            }
            else {
                count = (count + even) % mod;
                odd++;
            }
        }

        // int count =0;
        // int mod=1000000007;
        // for(int i=0;i<arr.length;i++){
        //             long sum=0;
        //     for(int j=i;j<arr.length;j++){
        //          sum+=arr[j];
        //          if(sum%2!=0){
        //             count=(count+1)%mod;
        //          }     
        //     }
        // }
        return count;
    }
}