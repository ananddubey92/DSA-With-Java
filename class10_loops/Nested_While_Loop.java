package class10_loops;

public class Nested_While_Loop {
    public static void main(String[] args) {
        int i=1;
        while(i<=2){
            int j=1;
            while(j<=3){
                System.out.println("i = "+i + ", j = "+j);
                j++;
            }
            i++;
        }
    }
}
