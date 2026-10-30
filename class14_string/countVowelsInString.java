package class14_string;

public class countVowelsInString {
    static int getVowelsCount(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='E'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Education";
        System.out.println(getVowelsCount(str));
    }
}
