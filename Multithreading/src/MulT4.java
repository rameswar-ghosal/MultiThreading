class Demo5 extends Thread {
	//In this case no args run method will be called by Thread class start method and it is executed by userdefined thread..
	public void run() {
		System.out.println("No args run method");
	}
	public void run(int i) { //To execute Parameterized run(int i) we have to call it explicitly in main method.
		System.out.println("Parameterized run method");
	}
}
public class MulT4 {

	public static void main(String[] args) {
		Demo5 demo=new Demo5();
		demo.start();
		//Two thread will be there one is main thread and another is userdefined.
		for(int i=0;i<10;i++)
			System.out.println("Hello World!");
	}

}
