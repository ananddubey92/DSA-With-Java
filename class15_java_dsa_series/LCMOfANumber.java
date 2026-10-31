package class15_java_dsa_series;

import static class15_java_dsa_series.GCDNumber.getGCD;

public class LCMOfANumber {
    static int getLCM(int a, int b){
        int gcd=getGCD(a,b);
        int prod=a*b;
        int lcm=prod/gcd;
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println(getLCM(18,12));
    }
}
