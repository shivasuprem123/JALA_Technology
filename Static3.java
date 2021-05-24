class Meth
{
     static int id=101;
    static String name="shiva";
    public void Fun()
    {
        System.out.println(this.id);
    }
}
class Main
{

    public static void main(String args[])
    {
       Meth m=new Meth();
       m.Fun();
       
    }
}
