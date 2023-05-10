/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int no=Integer.parseInt(args[0]);
		int m=1;
		for(int i=0;i<10;i++)
		{
		    System.out.println(no+"x"+m+"="+no*m);
		    m=m+1;
		}
	}
}
