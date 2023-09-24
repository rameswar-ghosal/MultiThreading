/*class Demo4 extends Thread {
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("Class Demo4");
	}
}*/

class Demo3 extends Thread{
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("Class Demo3");
	}
}
public class MulT1 {

	public static void main(String[] args) {
		//Demo4 demo1=new Demo4();
		Demo3 demo=new Demo3();
		demo.start();
		//demo1.start();
		for(int i=0;i<3;i++)
			System.out.println("Class Main");
	}

}
