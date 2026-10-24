class Solution {
    public int thirdMax(int[] nums) {

        int n=nums.length;
        
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       HashSet<Integer> set=new HashSet<>();

      for(int num :nums){
        if(set.add(num))
        {
            pq.add(num);
        }
        if(pq.size()>3){
            pq.remove();
        }
    }
    if(pq.size()<3){  
    while(pq.size()>1){
       pq.remove();
    }}
    return pq.peek();
    }
}