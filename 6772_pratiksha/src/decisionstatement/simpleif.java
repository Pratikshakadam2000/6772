package decisionstatement;
import java.util.Scanner;
public class simpleif
{

	public static void main(String[] args) 
	{
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("enter your marks");
		marks=in.nextInt();
		if(marks>36)
		{
			System.out.println("you are pass");
		}

	}
	
}

