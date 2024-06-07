package oopExam;

/*An abstract class is a superclass that cannot be instantiated 
 * it can’t create objects.
 * it contains both abstract and non abstract methods.
 * Abstract method can not be implemented, can be defined (declared) only
 * Non abstract methods can be implemented, but can not be defined (declared)
 * 
 * abstract class(AppleWatch-parent class) can not be inherited by Watch,DigitalWatch as they are interface but  can be inherited
 *  with AppleSeries5 by extending as it is a regular class.
 * 
 */

public abstract class AppleWatch {

	// abstract class can not be instantiated

	public String model;// variable to model name

	// constructor
	public AppleWatch(String model) {
		this.model = model;
	}

	public abstract void appleWatchInfo();

	public static void main(String[] args) {
		System.out.println("abstract method can not be instantiated directly"
				+ "\nit can include both abstract and non-abstract method");

	}
	
	public void displayVersion() {
		System.out.println("apple watch series 5");
	}

}
