class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;

          int[] ans=new int[nums.length];
          Arrays.fill(ans, -1);
          Stack<Integer> st=new Stack<>();
          for(int i =0;i<2*n;i++){
            int num=nums[i%n];
          while(st.size()>0 && nums[st.peek()]<num){
              ans[st.pop()]=num;
          }
          if(i<n) st.push(i);
          }


        return ans;


    // Arrays.fill(ans,-1);
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=1;j<nums.length;j++){
    //             int x=(i+j)%nums.length;
    //             if(nums[i]<nums[x]){
    //                 ans[i]=nums[x]; 
    //                 break;
    //             }
    //         }
    //     }
    //     return ans;
    
    //     int[] ans=new int[nums.length];

    //    Map<Integer,Integer> map=new HashMap<>();
    //    Queue<Integer> st=new LinkedList<>();

    //    for(int num :nums){
    //      while(st.size()>0 && st.peek()<num){
    //          map.put(st.remove(),num);
            
    //      } 
    //      st.add(num);
    //    }
    //       st.add(st.remove()); 
    //    while(st.size()>0){
    //     // int x=st.remove();
    //     // int y=st.remove();
    //     // st.add(st.remove());
    //     // if(x<y) map.put(x,y);
    //     map.put(st.peek(),-1);
    //     st.remove();
    //    }
    //    for(int i =0;i<nums.length-1;i++){
    //     ans[i]=map.get(nums[i]);
    //    }
    //    return ans;

    

    }
}  
