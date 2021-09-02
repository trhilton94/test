package prob1;

public class EmployeeUtilities {
	
	public EmployeeUtilities() {}
	
	public Employee getEmployeeWithMostHours(Employee[] emps) {
		Employee maxHours = emps[0];
		for(int i=1; i<emps.length; i++) {
			if(emps[i].getTotalHours()>maxHours.getTotalHours()) {
				maxHours = emps[i];
			}
		}
		return maxHours;
	}
	public double[] getHoursArray(Employee[] emps) {
		double[] totalHours = new double[emps.length];
		for(int i=0; i<emps.length; i++) {
			totalHours[i] = emps[i].getTotalHours();
		}
		return totalHours;
	}
	
	public double getTotalPay(Employee[] emps) { //Discrepancy with test expected and actual
		double totalPay = 0;
		for(int i=0; i<emps.length; i++) {
			totalPay += emps[i].getPay();
		}
		return totalPay;
	}
}
