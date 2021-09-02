package prob1;

public class Employee {
	private double[] hours = new double[7];
	private String name;
	private double payRate;
	
	public Employee(String name, double payRate) {
		this.name = name;
		this.payRate = payRate;
	}
	
	public double getHours(int day) {
		return hours[day];
	}
	public String getName() {
		return name;
	}
	public int getNumDaysWorked() {
		int daysWorked=0;
		for(int i=0; i<hours.length; i++) {
			if(hours[i]>0) {
				daysWorked++;
			}
		}
		return daysWorked;
	}
	public double getPay() {
		double pay = 0;
		double loopHours = 0;
		int numDaysWorked = getNumDaysWorked();
		for(int i=0; i<hours.length; i++) {
			loopHours += hours[i];
			if (i<=4) {
				pay += hours[i] * payRate;
			}
			else { //weekend
				pay += hours[i] * 2.0 * payRate;
			}
		}
		if(loopHours > 40) {
			pay += (loopHours - 40) * (payRate * 0.5);
		}
		if(numDaysWorked == 7) {
			pay += 50;
		}
		return pay;
	}
	public double getPayRate() {
		return payRate;
	}
	public double getTotalHours() {
		double totalHours=0;
		for(int i=0; i<hours.length; i++) {
			totalHours += hours[i];
		}
		return totalHours;
	}
	public double getWeekdayHours() {
		double weekdayHours=0;
		for(int i=0; i<=4; i++) {
			weekdayHours += hours[i];
		}
		return weekdayHours;
	}
	public double getWeekendHours() {
		double weekendHours=0;
		for(int i=5; i<=6; i++) {
			weekendHours += hours[i];
		}
		return weekendHours;
	}
	public void mergeEmployee(Employee e) {
		for(int i=0; i<hours.length; i++) {
			this.hours[i] += e.hours[i];
		}
	}
	public void newWeek() {
		for(int i=0; i<hours.length; i++) {
			hours[i]=0;
		}
	}
	public void setHours(int day, double hours) {
		this.hours[day] = hours;
	}
	
	@Override
	public String toString() {
		String msg = String.format("Pay Stub\n--------\nName:%s, Pay Rate $%.2f\n"
				+ "Hours:Mon:%.2f Tue:%.2f Wed:%.2f Thu:%.2f Fri:%.2f Sat:%.2f Sun:%.2f"
				+ "\nDays worked:%d, Total Hours:%.2f\nWeekday hours:%.2f, Weekend hours"
				+ ":%.2f\nTotal pay: $%.2f", name, payRate, getHours(0), getHours(1), getHours(2),
				getHours(3), getHours(4), getHours(5), getHours(6), getNumDaysWorked(), getTotalHours(),
				getWeekdayHours(), getWeekendHours(), getPay());
			return msg;
	}
}
