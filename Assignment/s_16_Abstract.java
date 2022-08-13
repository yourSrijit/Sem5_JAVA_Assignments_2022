//Write a Java Program to implement the following:
//Create a abstract base class TwoD that contains two instance
//variable length and breadth and an abstract method area(). Three
//subclasses triangle, square and rectangle inherits the base class
//TwoD and override the method area() according to their shape.
package Assignments;



abstract class TwoD{
	int length,breadth;
	abstract int area();
}
class Triangle extends TwoD{
	public int area() {
		length =5;
		breadth =2;
		int area =(length *breadth)*1/2;
		return area;
	}
}

class Square extends TwoD{
	public int area() {
		length =4;
		breadth =4;
		int area =(length *breadth);
		return area;
	}
}

class 	Rectangle extends TwoD{
	public int area() {
		length =5;
		breadth =3;
		int area =(length *breadth);
		return area;
	}
}
public class s_16_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle ob =new Triangle();
		Square ob1 =new Square();
		Rectangle ob2 =new Rectangle();
		System.out.println("Area is "+ob.area());
		System.out.println("Area is "+ob1.area());
		System.out.println("Area is "+ob2.area());
		
	
	}

}
