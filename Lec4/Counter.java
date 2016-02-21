class Counter {
	private int count = 0;
	public void increment () {
		this.count++;
	}
	public void dencrement () {
		this.count--;
	}
	public void getValue() {
		System.out.println("counter = "+count);
	}
	public static void main(String[] args) {
		Counter co = new Counter();
		co.increment();
		co.getValue();
		co.dencrement();
		co.getValue();

	}
}