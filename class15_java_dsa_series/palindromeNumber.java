package class15_java_dsa_series;

public class palindromeNumber {
  static boolean isPalindrome(int num) {
      int originalNum = num;
      int reversedNum = reverseANumber.reverseNumber(num);
      if (originalNum == reversedNum) {
          System.out.println("It is a palindrom: ");
          return true;
      } else {
          System.out.println("It is not palindrome: ");
          return false;
      }

  }



    public static void main(String[] args) {

      boolean ans=isPalindrome(1221);
        System.out.println(ans);
    }
}
