package classs13.arrays1d;

public class forEachLoop {
    public static void main(String[] args) {

         int arr[]={10,20,30};
//         int n=arr.length;
//         for(int index=0; index<=n-1; index++){
//             System.out.println(arr[index]);
//         }
        //2nd method
        for(int val: arr){
            System.out.println(val);
        }
    }
}
