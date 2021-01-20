public class Empwage {
	public static void main(String[] args) {
     		System.out.println("Employee Wage Compuatation problem");
		// constants
		int IS_FULL_TIME = 1;
		// computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println(empCheck);
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abscent");
}
}
