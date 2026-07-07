package DAY6.solutions;

public class l2 
{
    public static void main()
    {
        int n1=10;
        int n2=11;
        int n3=13;
        if(n1>n2&&n1>n3)
        {
            System.out.println("NUMBER 1 is greatest");
        }
        else if(n2>n1&&n2>n3)
        {
            System.out.println("NUMBER 2 is greatest");
        }
        else if(n3>n1&&n3>n2)
        {
            System.out.println("NUMBER 3 is greatest");
        }
    }
}
