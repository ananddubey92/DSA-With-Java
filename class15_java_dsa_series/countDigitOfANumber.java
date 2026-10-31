package class15_java_dsa_series;

public class countDigitOfANumber {
    static int counttDigits(int num){
        //agar mere num=0, toh mai ruk jaunga
        //agar mere num!=0, toh mai processing karta rahunga
        int count=0;
        while(num!=0){
            int digit=num%10;
            count++;
            //last digit remove
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
       int num=53127;
      int ans= counttDigits(num);
        System.out.println(ans);
    }
}
