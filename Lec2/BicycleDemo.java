class BicycleDemo{
	public static void main (String[] args)
	{
		Bicycle bike = new Bicycle();
		bike.changeCadence(5);
		bike.changeGear(2);
		bike.speedUp(50);
		bike.printStates();
	}
}