package class14_string;

import static class14_string.reverseAString.reverseString;

public class stringIsPalindromeOrNot {
    static boolean checkPlaindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        //compare
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                //no match
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="MOM";
        System.out.println(checkPlaindrome(str));
    }
}
