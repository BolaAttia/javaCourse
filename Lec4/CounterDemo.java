import java.util.Scanner;
class CounterDemo {

	public static void main(String[] args) {
	int exit=1;
	Scanner s = new Scanner(System.in);
	Counter head = new Counter();
	Counter tail = new Counter();
	
	do {
		
		for (int i=0;i<100 ;i++ ) {
			if (Math.random()<0.5) {
				head.increment();			
			}
			if (Math.random()>=0.5) {
				tail.increment();			
			}
		}
			head.getValue();
			tail.getValue();
		exit=s.nextInt();
	}while(exit!=0);
	}
}