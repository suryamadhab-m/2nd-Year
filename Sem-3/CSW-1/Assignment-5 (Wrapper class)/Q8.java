import java.util.Scanner;

public class Q8 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter true or false: ");
        String input = sc.nextLine();
        Boolean obj = Boolean.parseBoolean(input);
        System.out.println("Converted Boolean: " + obj);
    }
}
