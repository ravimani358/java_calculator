package Week1.Day1;

public class Calculator {
	
	public int add(int a, int b) {
		int c;
		c = a+b;
		return c;
	}
	
	public double sub(double a, int b) {
		double c;
		c = a-b;
		return c ;
	}
	
	public double multi(double a, int b) {
		double c;
		c = a*b;
		return c;
	}
	
	public int division(int a, int b) {
		int c;
		c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Calculator mathamatic = new Calculator();
		
		// Adding
		int addresult = mathamatic.add(1, 2);
		System.out.println("1. Addition"+"->"+addresult);
		
		//Subtract
		double subract = mathamatic.sub(5.5, 7);
		System.out.println("2. Subraction"+"->"+subract);
		
		// Multiplication
		double multiple_ans = mathamatic.multi(5.5, 10);
		System.out.println("3. Multiplication"+"->"+multiple_ans);
		
		//Divide
		int divid_ans = mathamatic.division(10, 9);
		System.out.println("4. Division"+"->"+divid_ans);
		
		
		
		
	}
	
}
