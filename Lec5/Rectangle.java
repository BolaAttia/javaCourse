public class Rectangle implements Shape {
	int x,y;
	double width;
	double height;
	static int counter;
	public Rectangle () {
		this(0,0,1,1);
        


	}
	public Rectangle (double width, double height) {
		this(0,0,width,height);


	}

	public Rectangle (int x, int y, double width, double height) {
		this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        counter++;
	}

	public double area (){
		return this.width*this.height;
	}
	public void setWidth (double width) {
		this.width=width;
	}
	public Rectangle compare (Rectangle R1) {
		if (R1.area()>this.area()) {
			return R1;
		}
		else {
			return this;
		}
		
	}
	static int getCount() {
		return counter;
	}

	/*
	public void printStates() {
		System.out.println("The Width is "+width);
	
	}
	*/

}