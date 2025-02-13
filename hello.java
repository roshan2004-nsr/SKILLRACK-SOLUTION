/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class hello
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String c="";
		for(int i=0;i<s.length();i++)
		{
		    if(Character.isLetter(s.charAt(i)))
		    {
		        c+=s.charAt(i);
		    }
		}
		String s1[]=s.split("[AaSsMmDd]");
		int a=Integer.parseInt(s1[0]);
		int b=Integer.parseInt(s1[1]);
		if(c.equals("A") || c.equals("a"))
		{
		    System.out.print(a+b);
		}
		else if(c.equals("S") || c.equals("s"))
		{
		    System.out.print(a-b);
		}
		else if(c.equals("M") || c.equals("m"))
		{
		    System.out.print(a*b);
		}
		else
		{
		    System.out.print(a/b);
		}
	}
}