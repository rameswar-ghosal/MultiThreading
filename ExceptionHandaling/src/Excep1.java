//Unchecked Exception-----

import java.util.Scanner;

public class Excep1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter the first number :");
			int a=s.nextInt();
			System.out.println("Enter the second number :");
			int b=s.nextInt();
			int res=a/b;
			System.out.println("The result is : "+res);
		}
		catch(Exception e)
		{
			System.out.println("Undefined!");
		}
		System.out.println("Terminated Succesfully");
	}

}
