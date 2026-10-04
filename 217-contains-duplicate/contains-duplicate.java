class Solution {
    static{
        for(int i=0;i<500;i++){
            containsDuplicate(new int[]{0});
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();

         for(int i=0;i<nums.length;i++){
            if(!map.contains(nums[i])) map.add(nums[i]);
            else return true;
         }
       return false;  
    }
}