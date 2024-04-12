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
  }

  public static void main(){
    String a="mwahaha";
    String b="ahahmaw";
    System.out.println(isAnagram(a,b));
  }
}
