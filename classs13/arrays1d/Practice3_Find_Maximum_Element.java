package classs13.arrays1d;

public class Practice3_Find_Maximum_Element {
    public static void main(String[] args) {
        int arr[]={4,2,-5,21,15};
        int max=arr[0];
        int n=arr.length;
        for(int i=1; i<=n-1; i++){
           if(arr[i]>max){
               max=arr[i];
           }
        }
        System.out.println(max);
    }
}
