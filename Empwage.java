public class Empwage {
	// constants
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private  CompnyEmpwage[] compnyEmpwageArray;

	public Empwage() {
		compnyEmpwageArray = new  CompnyEmpwage[5];
	}

	private void addCompnyEmpwage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays) {
		// declare an array for multiple company
		compnyEmpwageArray[numOfCompany] = new  CompnyEmpwage(company, empRatePerHour, maxHoursPerMonth,
				numOfWorkingDays);
		numOfCompany++;
	}

	private void computeEmpwage() {
		// calculating Total employee wage and storing it in to array
		for (int i = 0; i < numOfCompany; i++) {
			int totalEmpwage = this.computeEmpwage(compnyEmpwageArray[i]);
			System.out.println("Total emp wage for company " + compnyEmpwageArray[i].company + "  is:" + totalEmpwage);
		}
	}

	private int computeEmpwage( CompnyEmpwage  CompnyEmpwage) {
		// initalize the value and checking condition
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while (totalEmpHrs <=  CompnyEmpwage.maxHoursPerMonth && totalWorkingDays <  CompnyEmpwage.numOfWorkingDays) {
			totalWorkingDays++;
			int attendance = (int) (Math.random() * 3);
			switch (attendance) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs = (totalEmpHrs + empHrs);
			System.out.println("Days= " + totalWorkingDays + " Emp Hr: " + empHrs);
		}

		return totalEmpHrs *  CompnyEmpwage.empRatePerHour;
	}

	public static void main(String[] args) {
		// creating object and call the object
		Empwage Empwage = new Empwage();
		Empwage.addCompnyEmpwage("Dmart", 100, 26, 30);
		Empwage.addCompnyEmpwage("Reliance", 130, 28, 28);
		Empwage.addCompnyEmpwage("Bigbasket", 150, 23, 25);
		Empwage.computeEmpwage();
	}
}

class  CompnyEmpwage {
	// declaration
	protected final String company;
	protected final int empRatePerHour;
	protected final int maxHoursPerMonth;
	protected final int numOfWorkingDays;

	public  CompnyEmpwage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays) {
		// calling constructor
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;

	}
}
