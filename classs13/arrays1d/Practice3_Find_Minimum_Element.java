package classs13.arrays1d;

public class Practice3_Find_Minimum_Element {
    public static void main(String[] args) {
        int arr[]={2,4,6,-4,5};
        int min=arr[0];
        int n=arr.length;
        for(int i=1;i<=n-1; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
