class Meth
{
    static void Info()
    {
      int id=101;
      System.out.println("ID="+id);
      
    }
    public void Fun()
    {
        Meth m=new Meth();
        m.Info();
       String name="shiva"; 
       System.out.println("NAME ="+name);
    }
}
class Main
{

    public static void main(String args[])
    {
       Meth m1=new Meth();
       m1.Fun();
       
    }
}
