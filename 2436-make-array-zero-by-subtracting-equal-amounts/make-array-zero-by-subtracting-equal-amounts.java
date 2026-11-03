class Solution {
    public int minimumOperations(int[] nums) {
            HashSet<Integer> hs=new HashSet<>();

            for(int num: nums){
                if(num!=0) hs.add(num);
            }
            return hs.size();

        // PriorityQueue<Integer> pq= new PriorityQueue<>();
        // for(int num: nums){
        //     pq.add(num);
        // }
        // int count=0;
        // while(pq.size()>0){
        //     int a=pq.peek();
        //     pq.poll();
        //     if(pq.size()==0) break;
        //     int b=pq.peek();
        //     pq.poll();
        //     if(a==0) break;
        //     if(b==0) break;

        //     while(a!=0 ) a-=1;
        //     while(b!=0 ) a-=1;
        //     count++;
        // }
        // return count;
    }
}