package hw8Abstraction;

public abstract class MedicalSchool {

	// default constructor
	public MedicalSchool() {
		System.out.println("this is a default constructor");

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("this method is called non-abstract method");
	}

	public static void main(String[] args) {
		System.out.println("this method is called non-abstract method");

	}

}
