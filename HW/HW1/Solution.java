class Solution {
    public boolean isPalindrome(String s) {
    boolean isIt=true;
    String temp="";
    for (int i=0;i<s.length();i++) {
        if (Character.isLetterOrDigit(s.charAt(i))){
            temp+=s.charAt(i);
        }
    }
    temp=temp.toLowerCase();
    int n=temp.length();
    //compare char by char first char ==last? second char==second last?..
    for (int i=0;i<n;i++) {
      if (temp.charAt(i)!=temp.charAt(n-i-1)) {
        isIt=false;
        break;
      }
    }  
    return isIt;
  }
}
