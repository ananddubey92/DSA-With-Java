package classs13.arrays1d;

public class Practice2_Multiplication {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int mul=1;
        int n=arr.length;
        for(int i=0; i<=n-1; i++){
            int value=arr[i];
             mul=mul*value;
        }
        System.out.println(mul);
    }
}
