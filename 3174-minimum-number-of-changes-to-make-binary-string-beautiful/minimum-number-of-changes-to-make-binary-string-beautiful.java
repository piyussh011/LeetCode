class Solution {
    public int minChanges(String s) {
        // int j=0;
        int count=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)) count++;
        }
    //     int no1=0;
    //     int no0=0;
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='0') no0++;
    //         else no1++;
    //        if(s.charAt(i)==s.charAt(j)){
    //         j++;
    //         i++;
    //        }
    //        else{
    //           while(s.charAt(i)!=s.charAt(j)) j++;
    //         //   String immutable;
    //         //   char temp=s.charAt(i);
    //         //   s.charAt(i)=s.charAt(j);
    //         //   s.charAt(j)=temp;
    //           count+=2;
    //        }
    //        i++;
    //     }
    //     if(no0%2!=0 || no1%2!=0) count++;
    //     //  if(no0%2!=0 && no1%2!=0) count+=2;


     return count;
    }
}