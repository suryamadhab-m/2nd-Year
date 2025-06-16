public class Q10 
{
    public static void main(String[] args) 
    {
        String input = "5*10";  
        char operator = ' ';
        int index = -1;

        // Identify the operator and its position
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') 
            {
                operator = ch;
                index = i;
                break;
            }
        }

        int num1 = Integer.parseInt(input.substring(0, index));
        int num2 = Integer.parseInt(input.substring(index + 1));

        if (operator == '+') 
        {
            System.out.println("Sum=" + (num1 + num2));
        } 
        else if (operator == '-')
        {
            System.out.println("Sub=" + (num1 - num2));
        } 
        else if (operator == '*')
        {
            System.out.println("Mul=" + (num1 * num2));
        }
        else if (operator == '/') 
        {
            if (num2 != 0)
                System.out.println("Div=" + (num1 / num2));
            else
                System.out.println("Error: Division by zero");
        } 
        else
        {
            System.out.println("Invalid operator");
        }
    }
}
