class Prog4 {
	public static void main(String[] args) {
		int product=1;
		int[] num={1,3,4,5,7,9,4,8,9,11,13,10,2,12,15};
		for (int i=0;i<15 ;i++ ) {
			if (num[i]%2!=0) {
				System.out.println("the numbers are : "+num[i] +"\n");
				product *= num[i];
			}
		}
		System.out.println("the product of these numbers is : "+product);
	}
}