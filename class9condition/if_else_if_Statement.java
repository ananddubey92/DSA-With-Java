package class9condition;

import java.util.Scanner;

public class if_else_if_Statement {
        public static void main(String[] args) {
//            int accuracy = 78;
//            if(accuracy>=90){
//                System.out.println("Excellent");
//            } else if (accuracy>=75) {
//                System.out.println("Good");
//
//            } else if (accuracy>=60) {
//                System.out.println("Average");
//            }else {
//                System.out.println("Needs Improvement");
//            }
            Scanner sc = new Scanner(System.in);
            Short day=sc.nextShort();

            //int day=3;
            if(day == 1){
                System.out.println("Monday");
            }
            else if(day == 2){
                System.out.println("Tuesday");
            }
            else if(day == 3){
                System.out.println("Wed");
            }
            else if(day == 4){
                System.out.println("Thurs");
            }
            else if(day == 5){
                System.out.println("Fri");
            }
            else if(day == 6){
                System.out.println("Sat");
            }
            else if(day == 7){
                System.out.println("Sun");
            }
            else {
                System.out.println("Default");
            }
        }
    }

