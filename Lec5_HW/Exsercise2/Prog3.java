class Prog3 {
	public static void main(String[] args) {
		int x=3,y=4,z=5;
		if ((x*x)+(y*y)==(z*z) && x!=0&&y!=0&&z!=0) {
			System.out.println("These numbers could be the sides of a right triangle.");
		}
		else if ((x*x)+(y*y)!=(z*z) && x!=0&&y!=0&&z!=0) {
			System.out.println("These numbers could be the sides of a triangle.");
		}
		else {
			System.out.println("These numbers couldn't be the sides of a triangle.");
		}
	}
}