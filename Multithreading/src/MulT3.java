class Demo1 extends Thread {
	//start() overridden in this class so no more thread created
	public void start() {
		System.out.println("Start method overridden in Demo1 Class");
	}
	public void run() {
		System.out.println("Demo1 class");
	}
}
public class MulT3 {
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.start(); //In this case no new thread will be created.
		//To execute run method we need to explicitly call the run().
		demo.run();
		System.out.println("Main class");
	}
}
