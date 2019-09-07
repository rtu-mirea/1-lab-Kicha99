public class HelloWorld
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.age = 19;
        student.name = "Kirill";
        student.isAlive = true;
        System.out.println("Hello, Java!");
    }
}

class Student
{
    public String name;
    public int age;
    public boolean isAlive;
}