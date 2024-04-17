package hw10Abstraction;

public abstract class EngineeringSchool {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("this method is called non-abstract method");
	}

	public static void main(String[] args) {
		System.out.println("this method is called non-abstract method");

	}

}
