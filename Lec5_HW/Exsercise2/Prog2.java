class Prog2 {
	public static void main(String[] args) {
		int[][] digit={{1,2,3,2,1},{5,5,5,5,5},{1,1,6,1,1}};
		for (int i=0;i<5 ;i++ ) 
			for (int j=0;j<3 ;j++) {
				if (digit[i][j]==digit[i+1][j]) {
						System.out.println("this is a palindrome statement");
					}
			else if (digit[i][j]!=digit[i+1][j]) {
					System.out.println("this is not a palindrome statement");
			}
		}
	}
}