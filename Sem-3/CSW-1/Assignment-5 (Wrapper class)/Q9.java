import java.util.Scanner;

public class Q9
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Read and convert to Integer
        System.out.print("Enter an integer: ");
        String intInput = sc.nextLine();
        Integer intObj = Integer.valueOf(intInput);
        System.out.println("Converted Integer: " + intObj);

        // Read and convert to Float
        System.out.print("Enter a float: ");
        String floatInput = sc.nextLine();
        Float floatObj = Float.valueOf(floatInput);
        System.out.println("Converted Float: " + floatObj);

        // Read and convert to Double
        System.out.print("Enter a double: ");
        String doubleInput = sc.nextLine();
        Double doubleObj = Double.valueOf(doubleInput);
        System.out.println("Converted Double: " + doubleObj);

        // Read and convert to Boolean
        System.out.print("Enter true or false: ");
        String boolInput = sc.nextLine();
        Boolean boolObj = Boolean.valueOf(boolInput);
        System.out.println("Converted Boolean: " + boolObj);
    }
}
