package class15_java_dsa_series;

public class reverseANumber {
    static int reverseNumber(int num){
        int revNum=0;
        //ans=ans*10+currentDigit
        while(num!=0){
            int digit=num%10;
            revNum=revNum*10+digit;
            num=num/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int num=1234;
        int revNum=reverseNumber(num);
        System.out.println(revNum);
    }
}
