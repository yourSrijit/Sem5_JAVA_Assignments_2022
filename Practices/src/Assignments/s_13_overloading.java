//13. Write a java program to overload three methods named
//with addition() having different parameters.

package Assignments;
class sum{
	int sum ;
	float sum1;
	//We can achieve overloading by this three methods
	//1.number of arguments
	//2.order of arguments
	//3.type of arguments
//	We can't achieve overloading by changing the returb type 
	public int add(int a,int b) {
		sum =a+b;
		System.out.println("i am methd who takes two arguments");
		return sum;
	}
	public int add(int a,int b,int c) {
		sum =a+b+c;
		System.out.println("i am methd who takes three arguments");
		return sum;
	}
	public float add(float a,float b,float c) {
		float sum1=a+b+c;
		System.out.println("i am methd who takes three arguments as float");
		return sum1;
	}
}
public class s_13_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum ob =new sum();
		System.out.println("so the sum is "+ob.add(12, 12));
		System.out.println("so the sum is "+ob.add(12, 12,1));
		System.out.println("so the sum is "+ob.add(12.5f, 12.7f,1.5f));

	}

}
