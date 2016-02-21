class ShapeDemo {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(2.2,3.1);
		Rectangle rec3 = new Rectangle(1,1,2.2,2.5);

		// rec1.setWidth();
		// rec2.setWidth();
		// rec3.setWidth();

		System.out.println( rec1.compare(rec2.compare(rec3)).area() + "    "+Rectangle.getCount());

		// rec1.area();
		// rec2.area();
		// rec3.area();

	}
}