class Solution {
    //1st sol. 
    public boolean isPalindrome(String s) {
        String str;
        str = str.replaceAll("[^a-zA-Z0-9]", ""); //using regex, replace all not numbers 0-9 or alphabets a-z A-Z w nothing ""
        str=str.toLowerCase();
        int i=0;
        int end=str.length()-1;
        return isPalindrome(s.substring(i+1,end));
        if (str.charAt(i)==str.charAt(end)){
            return true;
        }
    }





    // 2nd sol.
    //beats only 4% w java but this code in python beats 67% of submissions
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
