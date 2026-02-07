public class EvenOdd
{
    public static void main(String[] args)
    {
        int numToExamine = 210;
        int examine;
        examine = numToExamine % 2;

        if (examine == 0)
        {
            IO.println("The number is even.");
        }
        else
        {
            IO.println("The number is odd.");
        }
    }
}
