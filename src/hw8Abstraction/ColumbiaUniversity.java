package hw8Abstraction;

public class ColumbiaUniversity {

//default constructor
	public ColumbiaUniversity() {
		System.out.println("default constructor in regular class");
	}

	public void biology() {
		System.out.println("columbia is a good university");

	}

	// regular class contain only non-abstract method

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
	}

}
