//Single try multiple catch block-----

import java.util.Scanner;

public class Excep2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Connection establish...");
			System.out.println("Enter the first number :");
			int a=s.nextInt();
			System.out.println("Enter the second number :");
			int b=s.nextInt();
			int res=a/b;
			System.out.println("The result is : "+res);
			
			int[] ar;
			System.out.println("Enter the size of array :");
			int size=s.nextInt();
			ar=new int[size];
			System.out.println("Enter the array element :");
			for(int i=0;i<ar.length;i++)
				ar[i]=s.nextInt();
			System.out.println("Enter a position to find the element :");
			int pos=s.nextInt();
			System.out.println(ar[pos]);
			System.out.println();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Undefined!");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array size must be positive");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong position entered!");
		}
		finally
		{
			System.out.println("Thank You");
		}
		System.out.println("Terminated Succesfully");
	}

}
