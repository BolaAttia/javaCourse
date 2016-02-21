class Square implements Shape {
	int x,y;

	public Square (int x1,int y1) {
		x=x1;y=y1;
	}
	public double calculateArea() {
		return x*y;
	}
	public double calculateCircumference() {
		return 2*(x+y);
	}
	public void printState() {
		System.out.println("Square @"+" x = "+this.x+" y = "+this.y+" Area = "+calculateArea()+" Circumference = "+calculateCircumference());
	
	}
}