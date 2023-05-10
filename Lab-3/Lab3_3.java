/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Duck{
    void Swim();
}

interface Canfly extends Duck{
    void Fly();
}
interface Canquack extends Duck{
    void Quack();
}
interface Cansqueaks extends Duck{
    void Squeaks();
}

class RD implements Cansqueaks{
    public void Swim(){
        System.out.println("I can Swim");
    }
    public void Squeaks(){
        System.out.println("Squeaks");
    }
   
}
class WD implements Duck{
    public void Swim(){
        System.out.println("I can Swim");
    }
}

class LD implements Canquack,Canfly{
    public void Swim(){
        System.out.println("I can Swim");
    }
    public void Quack(){
        System.out.println("Quack Quack");
    }
    public void Fly(){
        System.out.println("I can fly");
    }
}

class RHD implements Canquack,Canfly{
    public void Swim(){
        System.out.println("I can Swim");
    }
    public void Quack(){
        System.out.println("Quack Quack");
    }
    public void Fly(){
        System.out.println("I can fly");
    }
   
}

public class Main

{
	public static void main(String[] args) {
	RHD d1=new RHD();
	LD d2=new LD();
	RD d3=new RD();
	WD d4=new WD();
	
	System.out.println("Lake Duck");
	d2.Swim();
	d2.Quack();
	d2.Fly();
	System.out.println("");
	
	System.out.println("Wooden Duck");
	d4.Swim();
    System.out.println("");
	
	System.out.println("Rubber Duck");
	d3.Swim();
	d3.Squeaks();
	System.out.println("");
	
	System.out.println("Red Headed Duck");
	d1.Swim();
	d1.Quack();
	d1.Fly();
	System.out.println("");
	

	}
}
