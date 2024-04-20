package hw11UseOfSuperInChildClass;

public class Daughter extends Father{
	String birthMonth;
	int age;
	
	public Daughter() {
		super();
		System.out.println("family name from super class:" + super.familyName);
	}

	public Daughter(String birthMonth, int age,String name, int fatherage, char sex, boolean isUSCitizen) {
		super(name,age,sex,isUSCitizen);
		this.birthMonth = birthMonth;
		this.age = age;
		
		System.out.println("this is a parameterized constructor");
	}
	public void daughter() {
		System.out.println("Daughter's  regular method. Family Name: "+ super.familyName);
	}
	public void daughterInfo(String birthMonth, int age) {
		System.out.println("daughter information:birthMonth-"+birthMonth +","+"age-"+ age);
		
	}
  
}
