class Circle implements Shape {
	int x,y;
	double r;
	public Circle (int x1,int y1, double r1) {
		x=x1;y=y1;r=r1;
	}
	public double calculateArea() {
		return 3.14*r*r;
	}
	public double calculateCircumference() {
		return 2*3.14*r;
	}
	public void printState() {
		System.out.println("Circle @"+" x = "+this.x+" y = "+this.y+" Area = "+calculateArea()+" Circumference = "+calculateCircumference());
	}
}