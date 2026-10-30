package class14_string;

public class reverseAString {
    static String reverseString(String str){
        String reverse="";
        int n=str.length();
        for(int i=n-1; i>=0; i--){
            char ch=str.charAt(i);
            reverse=reverse+ch;
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str="Anand";
        System.out.println(reverseString(str));
    }
}
