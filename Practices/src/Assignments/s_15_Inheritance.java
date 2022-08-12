//Write a java program implement follows scenarios:
//Create a base class Car that has three static variables:- number
//of engine one, wheels four and steering one. This base class is
//being inherited by three sub classes Alto, HondaCity and
//Scorpio. All the sub classes have different methods for engine,
//seating and fuel consumption capacity.
package Assignments;

 class Car{
	static int engin=1,wheel=4,steering=1;
}
class Alto extends Car{
	public void engin() {
		System.out.println(" i am the engin of Alto car");
	}
	public void seating() {
		System.out.println("I am the seat of the Alto car");
	}
	public void fuel() {
		System.out.println("I am the fuel tank of the Alto car");
	}
}
 class HondaCity extends Car{
	public void engin() {
		System.out.println(" i am the engin of HondCity car");
	}
	public void seating() {
		System.out.println("I am the seat of the HondCity car");
	}
	public void fuel() {
		System.out.println("I am the fuel tank of the HondCity car");
	
}
	
}
	class Scorpio extends Car{
		public void engin() {
			System.out.println(" i am the engin of Scorpio car");
		}
		public void seating() {
			System.out.println("I am the seat of the Scorpio car");
		}
		public void fuel() {
			System.out.println("I am the fuel tank of the Scorpio car");
		}
	}
public class s_15_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alto ob =new Alto();
		ob.engin();
		ob.seating();
		ob.fuel();
		
			HondaCity ob1 =new HondaCity();
			ob1.engin();
			ob1.seating();
			ob1.fuel();
			
			Scorpio ob2 =new Scorpio();
			ob2.engin();
			ob2.seating();
			ob2.fuel();
	}

}
