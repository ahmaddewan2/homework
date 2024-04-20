package hw11UseOfSuperInChildClass;

public class Father {
	String name;
	int age;
	char sex;
	boolean isUSCitizen;
	String familyName;
	
	public Father() {
		System.out.println("it is a default constructor");
	
	

}
	public Father(String name, int age, char sex, boolean isUSCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.isUSCitizen = isUSCitizen;
		
		System.out.println("it is a parameterized constructor");
     }
	
	
	public void father() {
		System.out.println("it is a void type method");
	}
	public void fatherInfo(String name, int age, char sex, boolean isUSCitizen) {
		System.out.println("father information:name-"+this.name+","+"age-"+this.age+","+"sex-"+this.sex+
				","+"USCititzen-"+this.isUSCitizen);
	}
}
