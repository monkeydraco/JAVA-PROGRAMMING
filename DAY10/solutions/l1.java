package DAY10.solutions;

public class l1 
{
    String name=new String();
    int age;
    int usn;
    public void details(l1 object)
    {
        object.name="Hehe";
        object.age=20;
        object.usn=288;
        //return object;

    }

    public void display(l1 object)
    {
        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.usn);
    }

    public void main()
    {
        l1[] object=new l1[3];              //this creates an array capable of holding 3 student refrences
        object[0]=new l1();                 //this creates a student object and assigns it to the first element of the array
        object[1]=new l1();
        object[2]=new l1();
        //object[0]=details(object[0]);
        details(object[0]);
        display(object[0]);

        //object[1]=details(object[1]);
        details(object[1]);
        display(object[1]);

        //object[2]=details(object[2]);
        details(object[2]);
        display(object[2]);

    }

    
}
