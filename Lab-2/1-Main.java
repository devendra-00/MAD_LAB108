public class Main
{
    public static void main(String args[])
    {
        Mother m1=new Mother();
        m1.show();//Show of mother is called
        Child ch1=new Child();
        ch1.show();//Show inherited from mother is called
    }
}