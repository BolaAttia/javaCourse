class Calc {
	double numbers=0;
	double sum=0;
	double count=0;
	double sqsum=0;
	double mean=0;
	public void enter(double num) {
		 
				this.numbers=num;
				sum+=this.numbers;
				this.sum=sum;
				count++;
				sqsum+=(this.numbers*this.numbers);
			 
		
	}	
	public double getCount() {
		return this.count;
	}
	public double getSum() {
		return this.sum;
	}
	public double getMean() {
		return this.sum/this.count;
	}
	public double getDiviation() {
		return Math.sqrt((sqsum/count)-(mean*mean));
	}
	public double max(double entered) {
		double max=Double.NEGATIVE_INFINITY;
		if (entered>max) {
			max=entered;
		}
		return max;
	}

	public double min(double entered) {
		double min=Double.POSITIVE_INFINITY;
		if(entered<min) {
			min=entered;
		}
		return min;
	}
	public void printAll() {
		System.out.println(getCount());
		System.out.println(getSum());
		System.out.println(getDiviation());

	}
}