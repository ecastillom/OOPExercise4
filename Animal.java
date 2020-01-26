import java.util.jar.Attributes.Name;

public class Animal
{
    String Name;
    String Type;

    public Animal(String Name,  String Type)
    {
        this.Name = Name;
        this.Type = Type;
    }

    public void Attack(Student s)
    {
        System.out.println(this.Name + " " + this.Type + " is attacking... " + s.Name);
    }

}