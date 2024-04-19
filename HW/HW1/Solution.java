class Solution {
    //1st sol. 
    public boolean isPalindrome(String s) {
        if (s.length()<=1)
            return true;
        String str="";
        str = s.replaceAll("[^a-zA-Z0-9]", ""); 
        str=str.toLowerCase();
        System.out.println(str);
        int i=0;
        int end=str.length()-1;
        if (str.charAt(i)!=str.charAt(end))
            return false;
        return isPalindrome(str.substring(i+1,end));
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




    /* public void subString(String s){
        String str="";
        str = s.replaceAll("[^a-zA-Z0-9]", ""); 
        str=str.toLowerCase();
        int i=0;
        int end=str.length()-1;
        if (str.equals(""))
        return;
        System.out.println(str);
        subString(str.substring(i+1,end));

        }
    
    */
}
