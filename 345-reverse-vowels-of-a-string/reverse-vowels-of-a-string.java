class Solution {
    public String reverseVowels(String s) {
       int i=0;
       int j=s.length()-1;
       char[] a = s.toCharArray();
       while(i<j){
        if(!isVowel(a[i])){
            i++;
        }
        else if(!isVowel(a[j])){
            j--;
        }else{
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
       } 

       return new String(a);
    }
    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}