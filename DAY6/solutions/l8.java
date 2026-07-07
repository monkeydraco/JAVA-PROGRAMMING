package DAY6.solutions;

public class l8 
{
    public static void main()
    {
        int flag=1;
        int number = 5;
        for(int i=2;i<=number/2;i++)
        {
            if((number)%i==0)
            {
                flag=0;    
            }
        }

        if(flag==1)
        {
            System.out.println("NUMBER IS PRIME");
        }
        else if(flag==0)
        {
            System.out.println("NUMBER IS NOT PRIME");
        }
    }
    
}
