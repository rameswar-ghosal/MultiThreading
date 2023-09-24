class Demo extends Thread {
	public void run() {
		System.out.println("Demo Thread");
	}
}
public class MulT2 {

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.start();
		demo.start(); // An Ecxeption will be occur during the run time
		System.out.println("Main Thread");
	}

}
