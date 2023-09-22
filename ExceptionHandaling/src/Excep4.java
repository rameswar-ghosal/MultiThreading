//try with resource-----

import java.util.Scanner;
import java.util.*;
public class Excep4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s=new Scanner(System.in)) {
			System.out.println("Enter a number ::");
			int a=s.nextInt();
			System.out.println(a);
		} 
		catch(InputMismatchException e) {
			System.out.println("hehe");
		}
	}

}
