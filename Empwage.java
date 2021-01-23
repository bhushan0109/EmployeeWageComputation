public class Empwage {
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int MAX_HRS_IN_MONTH;
	private final int NUM_OF_WORKING_DAYS;

	public Empwage(String company, int EMP_RATE_PER_HOUR, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) 
	{

		this.company = company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
	}

	private int computeEmpWage()

	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int attendance = (int) Math.floor(Math.random() * 10) % 3;
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

		return totalEmpHrs * EMP_RATE_PER_HOUR;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation program");
		
		// created object for company Dmart
		Empwage dmart = new Empwage("Dmart", 100, 26, 30);
		System.out.println("Total Employee Wage for Company " + dmart.company + " is: " + dmart.computeEmpWage());
		
		// created object for company bigbasket
		Empwage BigBasket = new Empwage("BigBasket", 150, 23, 25);
		System.out.println("Total Employee Wage for Company " + BigBasket.company + " is: " + BigBasket.computeEmpWage());
	}
}

