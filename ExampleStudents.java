public class ExampleStudents
{

    public static void main(String[] args) {
        
        Student s1 = new Student("Efren", 29, 7);
        Student s2 = new Student("Elena",4,7);
        Student s3 = new Student("Estephanie",30,7);
        Student s4 = new Student("Erik",20,7);
        Student s5 = new Student("Vicky",59,7);

        Animal a1 = new Animal("Chihuahua", "Dog");
        Animal a2 = new Animal("Baby", "Shark");
        Animal a3 = new Animal("Mickey", "Mouse");
        Animal a4 = new Animal("Pooh", "Bear");
        Animal a5 = new Animal("Duffy", "Duck");

        a1.Attack(s1);
        a2.Attack(s2);
        a3.Attack(s3);
        a4.Attack(s4);
        a5.Attack(s5);

    }

}
