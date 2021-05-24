class Main
{
    public static void main(String args[])
    {
        Student.Info();
        Student.Display();
        Student s1=new Student();
        s1.Info1();
        s1.PassingYear();
    }
}
class Student
{
    static int id;
    static String name;
    public static void Info()
    {
        id=10;
        name="shiva";
    }
    public static void Display()
    {
        System.out.println("ID="+id+"\nName="+name);
    }
    int year;
    String clg;
    public void Info1()
    {
        year=2021;
        clg="VBIT";
    }
    public void PassingYear()
    {
     System.out.println("Year of passing+"+year+"\nCollege= "+clg);
    }
}
