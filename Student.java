// import java.util.jar.Attributes.Name;

// import sun.management.resources.agent;

public class Student extends User{

    // public String Name;
    // public int Age;
    public int CohortNumber;

    public Student(String Name, int Age, int CohortNumber)
    {
        super(Name, Age);
        this.CohortNumber = CohortNumber;
    }

    public void StudentDisplay()
    {
        System.out.println("Name: " + this.Name );
        System.out.println("Age: " + this.Age );
        System.out.println("Cohort: " + this.CohortNumber );
        
    }


}