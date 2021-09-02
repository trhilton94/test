package prob1;

public class Car {
	
	private double fuelCapacity;
	private double fuelEfficiency;
	private double fuelLevel;
	private double totalDistance;
	
	public Car(double fuelCapacity, double fuelEfficiency) {
		this(fuelCapacity, fuelEfficiency, 0);
	}
	public Car(double fuelCapacity, double fuelEfficiency, double fuelLevel) { 
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelLevel = fuelLevel;
		totalDistance = 0;
	}
	
	public void drive(double time, double rate) { 
		double desiredDistance = time * rate;
		double fuelUsed = desiredDistance / fuelEfficiency;
		if(fuelUsed<fuelLevel) {
			fuelLevel -= fuelUsed;
			totalDistance += desiredDistance;
		}
		else {
			totalDistance = fuelLevel * fuelEfficiency;
			fuelLevel = 0;
		}
	}
	public void fillUp(double amount) {
		if(amount>0) {
			if((amount + fuelLevel) <= fuelCapacity) {
				fuelLevel += amount;
			}
			else {
				fuelLevel = fuelCapacity;
			}
		}
	}
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
	public double getFuelLevel() {
		return fuelLevel;
	}
	public double getTotalDistance() {
		return totalDistance;
	}
	
	@Override
	public String toString() {
		String msg = String.format("fuelLevel=%.1f, totalDisance=%.1f, "
				+ "fuelCapacity%.1f, fuelEfficiency%.1f", fuelLevel, 
				totalDistance, fuelCapacity, fuelEfficiency);
		return msg; 
	}
}
