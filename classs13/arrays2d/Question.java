package classs13.arrays2d;

public class Question {
        public static void main(String[] args) {

            // Declaration and allocation
            int[][] arr = new int[4][];

            arr[0] = new int[2];  // Row 0 -> 2 columns
            arr[1] = new int[5];  // Row 1 -> 5 columns
            arr[2] = new int[10]; // Row 2 -> 10 columns
            arr[3] = new int[1];  // Row 3 -> 1 column

            // Print array structure
            for (int i = 0; i < arr.length; i++) {
                System.out.println(
                        "Row " + i + " -> " + arr[i].length + " columns"
                );
            }
        }
    }


