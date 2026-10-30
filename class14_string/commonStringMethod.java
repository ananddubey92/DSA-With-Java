package class14_string;

public class commonStringMethod {
    public static void main(String[] args) {
        //Find length
        System.out.println();
        String str="Anand";
        System.out.println("Length of str: "+str.length());

        //Find char of str
        System.out.println("Char of str: "+str.charAt(0));

        //Comparing
        String name="ANAND";
        System.out.println(str.equals(name));
        System.out.println(str.equalsIgnoreCase(name));

        //empty-> length = 0
        //blank-> empty or spaces hai string
        System.out.println();
        System.out.println("Find the value of str1 isEmpty() and isBlank()");
        String str1=" ";
        System.out.println(str1.length());
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());

        System.out.println();
        String name1=" Anand   ";
        System.out.println(name1.length());

        //.trim()-> it is used to ignore the value of spaces
        System.out.println();
        name1=name1.trim();
        System.out.println(name1.length());

        //convert to uppercase and lowercase using .toUpperCse() and .toLowerCse()
        System.out.println();
        System.out.println(name1.toUpperCase());
        System.out.println(name.toLowerCase());

        //Using .substring()
        System.out.println();
        String str2="My name is Anand";
        //0->m
        //1->y
        //2->apace and so on
        System.out.println(str2.substring(3,7));

        //.contains()
        System.out.println(str2.contains("Anand"));

        //Using .valueOf
        System.out.println();
        int num=5123;
        String str3=String.valueOf(num);
        System.out.println(num+1);
        System.out.println(str3+1);

        //Using .startsWith() and .endWith()
        System.out.println();
        System.out.println(str2.startsWith("My"));
        System.out.println(str2.startsWith("my"));
        System.out.println(str2.startsWith("My n"));
        System.out.println(str2.startsWith("My N"));
        System.out.println(str2.endsWith("Anand"));
        System.out.println(str2.endsWith("My"));

        //.toCharArray()
        System.out.println();
        String name2="Education";
        char[] chr=name2.toCharArray();
        //Print the char array
        for(char ch: chr){
            System.out.println("Value of char: "+ch);
        }
            //.split()
        System.out.println();
        String str4="My,name,is,Anand";
        String[] arr=str4.split(",");
        for(String str5: arr){
            System.out.println(str5);
        }

        //.replace()
        System.out.println();
        String name4="Aubey";
        name4=name4.replace('A','D');
        System.out.println(name4);

    }
}
