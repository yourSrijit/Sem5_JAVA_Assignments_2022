package practice;

public class print {
	private int x;
	private int y;
	

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public static void main(String[] args) {
		
		print ob =new print();
		ob.setX(10);
		ob.setY(20);
		System.out.println(ob.getX());
		System.out.println(ob.getY());
		
	}

}
