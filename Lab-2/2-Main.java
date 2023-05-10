public class Main
{
    public static void main(String args[])
    {
        One o1=new One();
        o1.show();//Show of mother is called
        Two t1=new Two();
        t1.show();//Show inherited from mother is called
    }
}