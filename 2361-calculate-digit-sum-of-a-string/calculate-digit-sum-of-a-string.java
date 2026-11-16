class Solution {
    public String digitSum(String s, int k) {
       while(s.length()>k){
           
          String ans="";
          for(int j=0;j<s.length();j+=k){
            int sum=0;
           for(int i=j;i<Math.min(j + k, s.length());i++){
              sum+=s.charAt(i)-'0';

           }
           ans+=sum;

       } 
        s=ans;
       }
       return s;
    }
}