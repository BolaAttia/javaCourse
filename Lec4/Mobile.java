class Mobile {

	
	int hour=11,min=55;
	

	public void makeCall (int enterNumber) {

			System.out.println("calling " + enterNumber);
			
	
}

	public void sendMessage (String mailChar) {

		if(mailChar.length()>60) {
			System.out.println("please delete some characters");
		}
		else {
			System.out.println("the message have been sent");
		}
	
}

	public void getClock() {

			System.out.println("the Clock is "+hour+"h  : "+min+"min");
		
	}
	/*public void setAlarm () {

	}*/

}