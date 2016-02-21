import java.util.Scanner;
class MobileDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Mobile mobile =new Mobile();
		System.out.println("Enter the message you want to send");
		String sendMessage=scan.nextLine();
		mobile.sendMessage (sendMessage); 
		System.out.println("Enter the number you want to call");
		int callNumber=scan.nextInt();
		mobile.makeCall (callNumber);
		System.out.println("Do you want to show the clock (1 or 0) ");
		int intactive=scan.nextInt();
		if (intactive==1)
		{
			mobile.getClock ();
	}
}
}