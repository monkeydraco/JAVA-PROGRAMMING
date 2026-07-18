package DAY8.solutions;

public class Student 
{
    int age;
    String name;
    int usn;

    public void main()
    {
        Student s1= new Student();
        s1.age=20;
        s1.name="Tarun";
        s1.usn=288;

        System.out.printf("Name : %s\n",s1.name);
        System.out.printf("Age : %d\n",s1.age);
        System.out.printf("USN : %d\n",s1.usn);

    }
 
}
