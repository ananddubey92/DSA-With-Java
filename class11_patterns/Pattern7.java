package class11_patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            //for each row -> 6 columns
            for(int j=1; j<=6; j++){
                if(i==1 || i==n){
                    System.out.print("* ");
                }
                else{
                    //Middle rows
                    if(j==1 || j==6){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();

        }
    }
}
