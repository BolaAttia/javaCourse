class CarDemo {
	public static void main (String[] args)
	{
		Car car = new Car();
		car.changeCadence(500);
		car.changeGear(2);
		car.speedUp(10);
		car.applyBrakes(50);
		car.printStates();
	}
}