package class15_java_dsa_series;

public class printDigitsOfANumber {
    static void printDigits(int num){
        //agar mere num=0, toh mai ruk jaunga
        //agar mere num!=0, toh mai processing karta rahunga
        while(num!=0){
            int digit=num%10;
            System.out.println(digit);
            //last digit remove
            num=num/10;
        }
    }
    public static void main(String[] args) {
        int num=53127;
        printDigits(num);
    }
}
