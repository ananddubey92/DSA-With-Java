package class12_methods;

public class Table2 {
    //declaration/definition
    static void print2Table(){
        for(int i=1; i<=10; i++){
            int ans=2*i;
            System.out.println("->" +ans);
        }
    }
    public static void main(String[] args) {
        //method call
        print2Table();
    }
}
