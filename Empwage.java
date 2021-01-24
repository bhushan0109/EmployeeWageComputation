public class Empwage {
	// class constants
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	// instance constants
	final String COMPANY_NAME;
	final int WAGE_PER_HR;
	final int MAX_WORKING_DAYS;
	final int MAX_WORKING_HRS;
	// instance variable
	int totalWage;

	Empwage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
		COMPANY_NAME = companyName;
		WAGE_PER_HR = wagePerHr;
		MAX_WORKING_DAYS = maxWorkingDays;
		MAX_WORKING_HRS = maxWorkingHrs;
		totalWage = 0;
	}

	int getEmpType() {
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHrs(int empType) {
		switch (empType) {
		case FULL_TIME:
			return 8;
		case PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

	void calculateTotalWage() {

		int workingHrs;
		for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
				&& totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
			int empType = getEmpType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * WAGE_PER_HR;
			totalWage += wage;

		}

	}

	public String toString() {
		System.out.println("Details of " + COMPANY_NAME + " employee");
		System.err.println("Wage per hour:" + WAGE_PER_HR);
		System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
		System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
		return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
	}

	public static void main(String args[]) {
		Empwage dmart = new Empwage("Dmart", 100, 20, 100);
		Empwage reliance = new Empwage("Reliance", 150, 30, 150);

		dmart.calculateTotalWage();
		System.out.println(dmart);

		reliance.calculateTotalWage();
		System.out.println(reliance);
	}
}
