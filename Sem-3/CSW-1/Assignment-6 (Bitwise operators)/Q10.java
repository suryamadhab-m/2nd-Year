public class Q10 
{
    public static boolean isDifferenceLessThanEpsilon(float a, float b) 
    {
        float diff = a - b;

        // Manual absolute value using basic comparison and negation
        if (diff < 0)
        {
            diff = -diff;
        }

        float epsilon = 1.0f;
        return diff < epsilon;
    }

    public static void main(String[] args) 
    {
        float x = 5.3f;
        float y = 4.8f;

        if (isDifferenceLessThanEpsilon(x, y)) 
        {
            System.out.println("Difference is less than ε");
        }
        else 
        {
            System.out.println("Difference is NOT less than ε");
        }
    }
}
