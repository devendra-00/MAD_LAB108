/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Testables{
    void display();
}

class Test implements Testables{
    public void display(){
        System.out.println("hello");
    }
}

abstract class Abstest implements Testables{
    //void display(){
    //    System.out.println("hello");
    //}
}
public class Main
{
	public static void main(String[] args) {
	Testables t=new Test();
	t.display();
	}
}
