package class14_string;

public class practiceQuestion2 {

    //Count the length of string and ignore the .length() keyword
    static int getLengthOfString(String str){
        char[] arr=str.toCharArray();
        int len=arr.length;
        return len;
    }

    public static void main(String[] args) {
        String str="Anand";
        System.out.println(getLengthOfString(str));
    }
}
