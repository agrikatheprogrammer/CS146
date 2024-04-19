class Solution {
    //1st sol. 
    //beats only 43% w java (13ms) but this code in python beats 67% of submissions
    public boolean isPalindrome(String s) {
     String temp= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
     int n=temp.length();
    if (n<=1) 
        return true;
    //compare char by char first char ==last? second char==second last?..
    for (int i=0;i<n;i++) {
      if (temp.charAt(i)!=temp.charAt(n-i-1)) {
        return false;
      }
    }  
        return true;
  }


    //4th solution(3rd and 2nd below)
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
    


    // passes 479/485 cases: memory exceeds for long strings
    public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    return isPalindromeHelper(str).equals(str);
}

private String isPalindromeHelper(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return isPalindromeHelper(s.substring(1)) + s.charAt(0);
}


    //2nd sol
    //accepted but time limit is reached for really long palindromes (deep recursion stack)
     public boolean isPalindrome(String s) {
        String str= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        if (str.length()<=1)
            return true;
        int i=0;
        int end=str.length()-1;
        if (str.charAt(i)!=str.charAt(end))
            return false;
        if (str.length()>1)
            return isPalindrome(str.substring(i+1,end));
        return true;
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
