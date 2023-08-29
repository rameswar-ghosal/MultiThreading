class Triangle{
	private int hight;
	private int base;
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	} 
}
public class TriangleArea {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.setBase(4);
		t1.setHight(6);
		int area=(t1.getBase()*t1.getHight())/2;
		System.out.println(area);
	}

}
