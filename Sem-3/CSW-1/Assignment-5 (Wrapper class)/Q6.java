import java.util.Scanner;

public class Q6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float: ");
        String input = sc.nextLine();
        Float obj = Float.parseFloat(input);
        System.out.println("Converted Float: " + obj);
    }

}
