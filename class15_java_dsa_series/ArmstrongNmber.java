package class15_java_dsa_series;

public class ArmstrongNmber {
    static boolean isArmstrongNumber(int  num){
        int sum=0;
        int originalNum=num;
        while(num!=0){
            int digit=num%10;
            int cubeOfDigit=digit*digit*digit;
            sum=sum+cubeOfDigit;
            num=num/10;
        }
        if(sum==originalNum){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(155));
    }
}
