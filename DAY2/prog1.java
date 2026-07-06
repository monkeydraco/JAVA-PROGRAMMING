package DAY2; // 1. Package first coz java uses codes like this com.DAY2.prog1
import java.time.LocalDate; // 2. Imports second    (built in library)


//please go through the code, dont try to understand the code, just try to understand the style of writing the code, or the 
//synatx of writing the code, and then write a new code in the same style, but with different functionality, and different class name,
//and different methods, and different fields, and different constructor, and different main method, and different static method, 
//and different instance method, and different local variable, and different return type, 
//and different parameters, and different access modifiers, and different comments.

public class prog1 // 3. Public class matching the filename "Employee.java"
{ 

    // 4. Fields (Encapsulation via private access)
    private String name;
    private double salary;
    
    // 5. Static Field (Shared constant value across all employees)
    public static final String COMPANY_NAME = "TechCorp";

    // 6. Constructor (Special method to build the object - no return type)
    public prog1(String name, double salary) 
    {
        this.name = name; // Using 'this' to target class field
        this.salary = salary;
    }

    // 7. Instance Method (Requires an object instance to run)
    public double calculateAnnualBonus(double percentage) 
    {
        double bonus = this.salary * (percentage / 100); // Local variable
        return bonus; // Return keyword matching method double type
    }

    // 8. Static Method (Can run without any objects existing)
    public static void printCompanyPolicy() 
    {
        System.out.println("Welcome to " + COMPANY_NAME);
        // cannot look at 'this.name' here because static has no instance context!
    }


    //main method we call it main function in c programming language
    public static void main(String[] args) 
    {
        // 1. Call the static method (no object needed)
        printCompanyPolicy();

        // 2. Create an instance (object) of your prog2 class
        prog1 employee1 = new prog1("Alex Jones", 50000.0);

        // 3. Use the object to calculate the bonus
        double bonusAmount = employee1.calculateAnnualBonus(10.0);

        // 4. Print the results to the screen
        System.out.println("Employee: " + employee1.name);
        System.out.println("Calculated Bonus: $" + bonusAmount);
    }
}
