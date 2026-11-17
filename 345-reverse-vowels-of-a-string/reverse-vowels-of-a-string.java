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
public static boolean isVowel(char ch){
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
             ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                 return true;
             }
          return false;
     }
}