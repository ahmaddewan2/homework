package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		
	

		Iphone1 ip1 = new Iphone1();
		ip1.setPrice(0);
		ip1.setmodelYear(2000);
		ip1.setUser('M');
		ip1.setMadeInUSA(true);

		Iphone2 ip2 = new Iphone2();
		ip2.iphone2Info();
		ip2.iphone2Info('M', 2000);

		Iphone6 ip6 = new Iphone6();
		ip6.compassInfo();
	

		Iphone6 standardPhone = new Iphone6();

		ConfiguredIphone6 customizedPhone = new ConfiguredIphone6();
		customizedPhone.iphoneInfo();

		System.out.println("standard iphone 6 material:" + standardPhone.materials());

		System.out.println("customized iphone 6 material:" + customizedPhone.materials());
	}

	/*
	 * single inheritance--a class only extend one class multiple inheritance-- a
	 * class extends multiple classes multilevel inheritance--a class extends
	 * another class which is also subclass hierarchical inheritance--multiple
	 * classes inherit one class
	 * 
	 * 
	 * interface can not be instantiated
	 * abstract method in abstract class can not be instantiated
	 * 
	 */

}
