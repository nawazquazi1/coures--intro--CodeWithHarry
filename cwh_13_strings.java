import java.util.Scanner;

public class cwh_13_strings {
    public static void main(String[] args) {

        // A string is a sequence of characters.
        //  Strings are objects that represent a char array. For example :
        //char[] str = {'H', 'A', 'R', 'R', 'Y'};
        //String s = new String(str);

        // is same as :
        //String s = "Harry";

        //Strings are immutable and cannot be changed.
        //java.lang.String class is used to create a String object.
        //The string is a class but can be used as a data type.
        //Syntax of strings in Java :
        // String str1 = "<sequence_of_string>";
        //Example :
        //String str = "CodeWithHarry";

        //Different ways to create a string in Java :
        //In Java, strings can be created in two ways :

        //By using string literal
        //By using the new
        //Creating String using String literal :
        String s1 = "String literal";

        // When we create a string using "new", a new object is always created in the heap memory.
        //Creating String using new :
        String s = new String("Harry");

        //See the examples given below to get a better understanding of String literal and String object :

        //String str1 = "CodeWithHarry";
        //String str2 = "CodeWithHarry";
        //System.out.println(str1 == str2);//true


        String str1 = new String("Keep coding");
        String str2 = new String("Keep coding");
        System.out.println(str1 == str2);//false


        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);

    }
}
