package class9condition;

public class Nested_if_else {
    public static void main(String[] args) {
        int age=18;
        if(age==18){
            System.out.println("You are eligible for vote");
            if(age>18){
                System.out.println("You are young man");
            }
            else{
                System.out.println("You are not young man");
            }
        }
        else{
            System.out.println("You are not eligible for vote");
        }

    }
}
