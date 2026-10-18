class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return true;
       int l=0;
       int e=s.length()-1;
       while(l<e){
        while (l<e && !Character.isLetterOrDigit(s.charAt(l))) l++;
        while (l<e &&  !Character.isLetterOrDigit(s.charAt(e))) e--;
        if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(e))){
            return false;
        }
       else{
         e--;
        l++;
       }}
       return true;
    }
}