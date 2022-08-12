//14. Write a java program to overload three constructor named

//with Addition() having different parameters.

//constructor:Constructor is a special kind of methods whose name is as the class name .It is invoked as when we create
//an object of the class or instance of the class.
//In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created.
//At the time of calling constructor, memory for the object is allocated in the memory.
package Assignments;

class Test{
	int mul;
        Test(int a,int b) {
		mul= a*b;
		System.out.println("I am parametarized constructor with two argumets "+mul);
	
	}
	 Test(int a,int b,int c) {
		mul= a*b*c;
		System.out.println("I am parametarized constructor with three argumets "+mul);
	
	}
	 Test(int a,int b,int c,int d) {
		mul= a*b*c*d;
		System.out.println("I am parametarized constructor with four argumets "+mul);

	}
}
public class s_14_Constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob =new Test(4,6);
		Test ob1 =new Test(4,6,10);
		Test ob2 =new Test(4,6,10,10);
		
		
	// //*	i am sr ////ijit */
	}

}
