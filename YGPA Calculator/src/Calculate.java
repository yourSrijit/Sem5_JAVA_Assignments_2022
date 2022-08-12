import java.util.Scanner;

public class Calculate {
	float even_credit,even_creditpoint,odd_credit,odd_creditpoint;
	float find_ygpa;
	Scanner sc =new Scanner(System.in);
	
	public void odd() {
		System.out.println("Enter your Odd semester Information:");
		System.out.println("Enter Odd semester total Credit");
		odd_credit =sc.nextFloat();
		System.out.println("Enter Odd semester total Credit Point");
		odd_creditpoint =sc.nextFloat();
	
	}
	public void even() {
		System.out.println("Enter your Even semester Information:");
		System.out.println("Enter Even semester total Credit");
		even_credit =sc.nextFloat();
		System.out.println("Enter Even semester total Credit Point");
		even_creditpoint =sc.nextFloat();
		
	}
	public void diplay() {
		System.out.println("You Entered this.......");
		System.out.println("\t\tCredit\tCredit point\n");
		System.out.println("Odd\t\t"+odd_credit+"\t\t"+odd_creditpoint);
		System.out.println("Even\t\t"+even_credit+"\t\t"+even_creditpoint);
		
		System.out.println();
	}
	public float ygpa() {
		float total_creditindex =(even_creditpoint + odd_creditpoint);
		float total_credit =(even_credit + odd_credit);
		find_ygpa =(total_creditindex /total_credit);
		return find_ygpa;
		
	}
}
