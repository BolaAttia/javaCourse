import java.util.Scanner;

class CalcDemo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Calc calc =new Calc();
		double num = scan.nextDouble();
		while (num!=0) {
			 calc.enter(num);}
		calc.printAll();
	}
}