package class14_string;

public class ComparingString {
    public static void main(String[] args) {
        //Comparing ==
        String name1="Anand";
        String name2="Anand";
        if(name1==name2){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both string are not equal  ");
        }
        //comparing .equals()
        String name3="Anand";
        String name4="Anand";
        if(name3.equals(name4)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both string are not equal  ");
        }
        //Comparing .equalsIgnoreCse()
        String name5="Anand";
        String name6="ANAND";
        if(name5.equalsIgnoreCase(name6)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both string are not equal  ");
        }

    }
}
