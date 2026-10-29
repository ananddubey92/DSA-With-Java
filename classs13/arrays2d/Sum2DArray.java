package classs13.arrays2d;

public class Sum2DArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{1,2,3}};
        int sum=0;
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                int value=arr[i][j];
                sum=sum+value;

            }

        }
        System.out.println(sum);
    }
}
