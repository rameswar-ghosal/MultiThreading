class Demo4 extends Thread {
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("Class Demo4");
	}
}

class Demo7 extends Demo4 {
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("Class Demo7");
	}
}
public class MulT5 {

	public static void main(String[] args) {
		Demo7 demo=new Demo7();
		demo.start();
		for(int i=0;i<3;i++)
			System.out.println("Class Main");
	}

}
