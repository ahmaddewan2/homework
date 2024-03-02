package hw4Constructor;

public class Student {

	// variable is declared
	public String stName;
	public int stID;
	public boolean isProgrammer;
	public float stGrade;
	public char stGender;

	public Student() {// declaring default constructor
		System.out.println(":-------this is all about student-------:");

	}

	public Student(String stName, int stID, boolean isProgrammer, float stGrade, char stGender) {// declaring the parameterized constructor
		super();
		this.stName = stName;
		this.stID = stID;
		this.isProgrammer = isProgrammer;
		this.stGrade = stGrade;
		this.stGender = stGender;

		System.out.println("student name:" + stName + ",student id:" + stID + ",Student gender:" + stGender
				+ ",student Grade:" + stGrade + ",student is a programmer:" + isProgrammer);

	}
}


