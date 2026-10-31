package class15_java_dsa_series;

public class GCDNumber {
    static int getGCD(int a, int b){
        //GCD/HCF->Greatest Common Diviser/Highest Common Factor
        //gcd(a,b) = gcd(b,a%b)
        while(b!=0){
            int oldValueOfb=b;
            b=a%b;
            a=oldValueOfb;
        }
        //jab mera b=0 hoga tab a ki place pr gcd milega
        int ans=a;
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(getGCD(18,12));
    }
}
