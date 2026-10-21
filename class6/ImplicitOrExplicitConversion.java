package class6;

public class ImplicitOrExplicitConversion {
    public static void main(String[] args) {

        //Implicit Conversion
        byte num1=127;
        long newNum=num1;
        System.out.println(newNum);

        //Explicit Conversion
        long value1=123456789;
        int value2=(int)value1;
        System.out.println(value2);
    }
}
