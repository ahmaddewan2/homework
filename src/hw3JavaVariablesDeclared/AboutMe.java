package hw3JavaVariablesDeclared;


public class AboutMe {

	// variables declared
	public String myName;
	public Boolean fullTimestudent;
	public Integer myAge;
	public byte myGrade;
	public short numberOfMyBooks;
	public long populationOfMyCity;

	public double myHeight;
	public char myGender ;

	// declaring construction
	public AboutMe() {
		System.out.println(":------This is all about Myself--------:");
		System.out.println("myName:");
		System.out.println("my_Age");

	}

	// implementation of void type of method
	public void aboutMe() {
		System.out.println("\nMy Name:" + myName + "\nMy Age:" + myAge + "\nMy Gender:" + myGender
				+ "\nI am full time student:" + fullTimestudent + "\nmy height:" + myHeight + "\nmy grade:"+ myGrade +"\nmy total books:"+
				numberOfMyBooks +"\nmy city population:"+populationOfMyCity);

	}

	public static void main(String[] args) {


		AboutMe aboutMe = new AboutMe();
		aboutMe.aboutMe();

	}

}





































