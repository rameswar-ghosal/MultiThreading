//Rules of overriding respect to Exception----
class Demo{
	//public void m() {}    Compiletime Error
	public void m() throws ClassNotFoundException {
		
	}
}
class Demo2 extends Demo{
	public void m() throws ClassNotFoundException {
		
	}
}

public class Excep6 {

	public static void main(String[] args) {
		Demo2 demo=new Demo2();
	}

}
