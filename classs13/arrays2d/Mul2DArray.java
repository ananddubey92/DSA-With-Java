package classs13.arrays2d;

public class Mul2DArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{1,2,3,4}};
        int mul=1;
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                int value=arr[i][j];
                mul=mul*value;
            }
        }
        System.out.println(mul);
    }
}
