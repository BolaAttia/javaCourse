import java.util.Scanner;
class dd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0;
		
		
		loop: while (s.hasNextInt()){
			x=s.nextInt();
		switch (x) {
			case 0:
				break loop;
				case 1 :
				System.out.printf("Success");
				break;
			case 2:
			    System.out.printf("Data");
				break;
			case 3:
			    System.out.printf("Bye");
				break;
			default:
			    System.out.printf("Error");
				break;
		}

		}
	}
}