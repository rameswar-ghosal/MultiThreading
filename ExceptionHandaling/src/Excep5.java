//try with multi-catch-------


public class Excep5 {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int a=10/0;
			;;;;
		} catch(ArithmeticException | NullPointerException e ) {
			System.out.println("Exception occur!");
		}
	}

}
