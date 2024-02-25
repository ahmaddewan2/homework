package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		// 
		AboutMe dewan = new AboutMe();
		AboutMe syed = new AboutMe();
		AboutMe alex = new AboutMe();

		dewan.myName = "Dewan";
		dewan.fullTimestudent = true;
		dewan.myAge = 35;
		dewan.myGrade = 90;
		dewan.numberOfMyBooks = 345;
		dewan.populationOfMyCity = 87654321;

		dewan.myHeight = 5.11;
		dewan.myGender = 'M';
		dewan.aboutMe();

		System.out.println("------------------------------");

		syed.myName = "Syed";
		syed.fullTimestudent = true;
		syed.myAge = 33;
		syed.myGrade = 80;
		syed.numberOfMyBooks = 245;
		syed.populationOfMyCity = 87754311;

		syed.myHeight = 5.10;
		syed.myGender = 'M';
		syed.aboutMe();

		System.out.println("-------------------------");

		alex.myName = "alex";
		alex.fullTimestudent = true;
		alex.myAge = 34;
		alex.myGrade = 70;
		alex.numberOfMyBooks = 445;
		alex.populationOfMyCity = 88754321;

		alex.myHeight = 5.9;
		alex.myGender = 'M';
		alex.aboutMe();

	}
}