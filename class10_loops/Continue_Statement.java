package class10_loops;

public class Continue_Statement {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==5 || i==2){
                continue;
            }
            System.out.println(i);
        }
    }
}
