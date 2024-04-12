class Solution{
  public static boolean isAnagram(String s,String v){
    ArrayList<Character> s_chars=charsInString(s);
    ArrayList<Character> v_chars=charsInString(v);
    boolean sSubv=true;
    boolean vSubs=true;
    for (Character a:s_chars){
      if (!v_chars.contains(a))
        sSubv=false;
    }
    for (Character a:v_chars){
      if (!s_chars.contains(a))
        vSubs=false;
    }
    return vSubs&&sSubv;
  }
  

  public static ArrayList<Character> charsInString(String s){
    ArrayList<Character> result=new ArrayList<>();
    for (int i=0;i<s.length();i++){ 
      result.add(s.charAt(i));
    }
    return result;
  }

  public boolean isAnagramCounting(String string1, String string2) {
    if (string1.length() != string2.length()) {
        return false;
    }
    int count[] = new int[CHARACTER_RANGE];
    for (int i = 0; i < string1.length(); i++) {
        count[string1.charAt(i)]++;
        count[string2.charAt(i)]--;
    }
    for (int i = 0; i < CHARACTER_RANGE; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    return true;
}

  public static void main(String[] args){
    String a="mwahaha";
    String b="ahahmaw";
    System.out.println(isAnagram(a,b));
  }
}
