package DAY9.solutions;

public class l12 
{
    int number;
    public void square(int num)
    {
        System.out.println(num*num);
    }

    public static void main()
    {
        l12 num1=new l12();
        num1.number=10;
    
        num1.square(num1.number);
    }
    
}
