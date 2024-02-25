package hw2JavaVariablesInitialized;

public class AboutMe {

	// variables declared
	public String myCountry;
	public Boolean fullTimestudent;
	public Integer my_age;
	public Character my_gender;

	// now initializing String , float, int,char ,boolean type variables

	public String myName = "Dewan";
	public int my_Age = 35;
	public double my_Height = 5.11;
	public char myGender = 'M';
	public boolean fullTimeStudent = true;

	// declaring construction
	public AboutMe() {
		System.out.println(":------This is all about Myself--------:");
		System.out.println("myName:");
		System.out.println("my_Age");

	}

	// implementation of void type of method
	public void aboutMe() {
		System.out.println("My Name:" + myName + "My Age:" + my_Age + "My Gender:" + myGender
				+ "I am full time student:" + fullTimestudent + "my height" + my_Height);

	}

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		aboutMe.aboutMe();

	}

}
