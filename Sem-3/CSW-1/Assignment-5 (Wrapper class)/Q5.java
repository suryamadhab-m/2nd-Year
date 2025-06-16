import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = sc.nextLine();
        Integer obj = Integer.parseInt(input); // Convert string to Integer
        System.out.println("Converted Integer: " + obj);
    }
}
