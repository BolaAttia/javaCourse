class Bicycle {

	
	int cadence =0;
	int speed=0;
	int gear=1;


	void changeCadence(int newValue)
	{
		cadence=newValue;
	}

	void changeGear(int newValue)
	{
		gear=newValue;
	}
	void speedUp(int increment)
	{
		speed+=increment;
	}
	void applyBrakes(int dencrement){
		speed-=dencrement;
	}
	void printStates(){
		System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
	}

}