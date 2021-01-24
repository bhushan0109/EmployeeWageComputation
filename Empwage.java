public class Empwage{
 static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HRS = 20;
    static final int NUM_OF_WORKING_DAYS = 20;
    static final int MAX_HRS_IN_MONTH = 100;

    public static int computeEmpWage() {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 8;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HRS;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to emp wage computation ");
        computeEmpWage();
    }
}