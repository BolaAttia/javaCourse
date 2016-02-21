class Triangle implements Shape {
	int x,y;

	public Triangle (int x1,int y1) {
		x=x1;y=y1;
	}
	public double calculateArea() {
		return 0.5*x*y;
	}
	public double calculateCircumference() {
		return (2*x)+y;
	}
	public void printState() {
		System.out.println("Triangle @"+" x = "+this.x+" y = "+this.y+" Area = "+calculateArea()+" Circumference = "+calculateCircumference());
	
	}
}