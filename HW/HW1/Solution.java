public class Solution {
  public boolean isPalindrome(String s) {
    boolean isIt=true;
    int n=s.length();
    //compare char by char first char ==last? second char==second last?..
    for (int i=0;i<n;i++) {
      if (s.charAt(i)!=s.charAt(n-i-1)) {
        isIt=false;
        break;
      }
    }  
    return isIt;
  }
}
