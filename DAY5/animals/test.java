package DAY5.animals;

public class test 
{
    public static void main()
    {
        Cat a = new Cat();
        a.name="bob";
        Cat cat=makeCatNameUpperCase(a);
        System.out.println(cat.name);
        System.out.println(a.name);

    }

    public static Cat makeCatNameUpperCase(Cat cat)
    {
        cat.name=cat.name.toUpperCase();
        return cat;
        
        
    }
    
}
