import java.util.Scanner;

public class Q7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double: ");
        String input = sc.nextLine();
        Double obj = Double.parseDouble(input);
        System.out.println("Converted Double: " + obj);
    }
}
