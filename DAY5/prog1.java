package DAY5;

public class prog1
{
    public static void main()
    {
        String str="  SANJANA ";
        String s1=upperCase(str);

        System.out.println(s1);
        
    }

    public static String upperCase(String str)
    {
        return str.trim().toUpperCase();

    }
    
}

