package class9condition;

public class if_else_Statement{
    public static void main(String[] args) {
        //1st Example
        int score=42;
        if(score>=50){
            System.out.println("Pass: ");
        }else{
            System.out.println("Fail");
        }

        //2nd Example
        int age=20;
        if (age>18){
            System.out.println("You eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

}
