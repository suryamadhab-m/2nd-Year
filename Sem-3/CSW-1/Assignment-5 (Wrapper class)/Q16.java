import java.util.Scanner;

public class Q16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        String choice;
        do 
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;

            System.out.print("Do you want to enter more numbers? (yes/no): ");
            choice = sc.next();
        }
        while (choice.equalsIgnoreCase("yes"));

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
