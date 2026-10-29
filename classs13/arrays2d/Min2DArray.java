package classs13.arrays2d;

public class Min2DArray {
        public static void main(String[] args) {
            int arr[][]={{1,2,3},{-1,5,6}};
            int min=arr[0][0];
            for(int i=0; i<=arr.length-1; i++){
                for(int j=0; j<=arr[i].length-1; j++){
                    if(arr[i][j]<min){
                        min=arr[i][j];
                    }
                }

            }
            System.out.println(min);
        }
    }


