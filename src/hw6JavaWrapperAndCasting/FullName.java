package hw6JavaWrapperAndCasting;

public class FullName {

	public String fullName(int fName, int lName) {
		String fullName = fName + " " + lName;
		System.out.println("Family Member:" + fName + lName);
		return fullName;
	}

	public int salary(String januarySalary, double februarySalary) {
		System.out.println("Average Salary:" + (Integer.parseInt(januarySalary) + (int) februarySalary) / 2);
		return 0;

	}

	public static void main(String[] args) {
		FullName details = new FullName();

		details.salary("10", 20.5);
		details.salary("30", 20.5);

	}

}
