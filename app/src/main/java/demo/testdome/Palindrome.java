package demo.testdome;

public class Palindrome {

    public static boolean isPalindrome(String word) {

        String reverseStr = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + word.charAt(i);
        }
        if(word.equalsIgnoreCase(reverseStr)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
