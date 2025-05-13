package recursion;

public class IsPalindrome {
    public static boolean IsPalindrome(String s){
        if (s.length() == 0||s.length() == 1){
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)){
            // String newWord = s.substring(1, s.length() - 1);
            // System.out.println(newWord);
            return IsPalindrome(s.substring(1, s.length() - 1));
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(IsPalindrome("racecar"));
    }
}
