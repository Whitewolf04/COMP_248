package Assignments;

public class CPU {
	// Initiating attributes
	private int cpuGeneration;
	private String cpuSeries, launchDate;
	private double cpuSpeed, price;
	private boolean cpuSGX;
	
	// Standard constructor with no parameters
	public CPU() {
		cpuGeneration = 1;
		cpuSeries = "i3";
		price = 117;
		cpuSpeed = 2.93;
		launchDate = "Q1'10";
		cpuSGX = false;
	}
	
	// Constructors with 6 arguments supplied by the user
	public CPU(int generation, String series, double priceInUSD, double speed, String dateLaunched, boolean supportSGX ) {
		cpuGeneration = generation;
		cpuSeries = series;
		price = priceInUSD;
		cpuSpeed = speed;
		launchDate = dateLaunched;
		cpuSGX = supportSGX;
	}
	
	// Accessor method for CPU generation variable
	public int generation() {
		return(cpuGeneration);
	}
	
	// Accessor method for CPU series variable
	public String series() {
		return(cpuSeries);
	}
	
	// Accessor method for CPU price variable
	public double priceInUSD() {
		return(price);
	}
	
	// Accessor method for CPU speed variable
	public double speed() {
		return(cpuSpeed);
	}
	
	// Accessor method for CPU launch date variable
	public String dateLaunched() {
		return(launchDate);
	}
	
	// Accessor method for CPU SGX support variable
	public String supportSGX() {
		if (cpuSGX == true)
			return("SGX is supported");
		else
			return("SGX is not supported");
	}
	
	// Mutator method for price
	public void setPrice(double suggestedPrice) {
		price = suggestedPrice;
	}
	
	// Method for calculating current price of the CPU
	public double priceNow(String sQuarterYear) {
		int quarterPassed = 0;
		
		// Set year as the integer at the end of the date string
		int yearLaunched = Integer.parseInt(launchDate.substring(3));
		int yearNow = Integer.parseInt(sQuarterYear.substring(3));
		
		// Set quarter as the integer in the 1st index of the date string
		int quarterLaunched = Integer.parseInt(launchDate.substring(1, 2));
		int quarterNow = Integer.parseInt(sQuarterYear.substring(1, 2));
		
		if (yearNow >= yearLaunched) { // If year now is smaller, there won't be any calculations
			// minus 1 in case the current quarter is smaller than the quarter at launch
			quarterPassed += (yearNow - yearLaunched - 1)*4;
			if (quarterNow > quarterLaunched) {
				// If current quarter is bigger, add back the 4 quarters lost due to previous calculation
				quarterPassed += quarterNow - quarterLaunched + 4;
			} else if (quarterNow < quarterLaunched) {
				// If the current quarter is smaller, add 4 quarters first and then subtract to avoid negative number
				quarterPassed += (quarterNow + 4) - quarterLaunched;
			}
		}
		
		// Calculate the current price
		price = price * Math.pow(0.98, quarterPassed);
		return(price);
	}
	
	public String toString() { // toString method print out the description of the CPU
		String printSGX;
		if (cpuSGX == true)
			printSGX = " SGX is supported.";
		else
			printSGX = " SGX is not supported";
		return("This CPU is " + cpuGeneration + "th generation " + cpuSeries
				+ "(" + cpuSpeed + "GHz), " + "launched: " + launchDate + " with price: "
				+ price + " USD." + printSGX);
	}
	
	// isHigherGeneration method for comparing the generations of 2 CPUs
	public boolean isHigherGeneration(CPU anotherCPU) {
		return (cpuGeneration > anotherCPU.cpuGeneration);
	}
	
	// equals method for comparing the attributes of 2 CPUs
	public boolean equals(CPU anotherCPU) {
		return(cpuGeneration == anotherCPU.cpuGeneration && cpuSeries.equals(anotherCPU.cpuSeries)
				&& cpuSpeed == anotherCPU.cpuSpeed && price == anotherCPU.price && launchDate.equals(anotherCPU.launchDate)
				&& cpuSGX == anotherCPU.cpuSGX);
	}

}
