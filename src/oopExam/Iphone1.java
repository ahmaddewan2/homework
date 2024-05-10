package oopExam;



public class Iphone1 {
	
	public void regularClassInfo() {
		System.out.println("regular class-can be instantiated.have only non-abstract method");
		System.out.println("Interface-can not be instantiated. have only abstract method ");
		System.out.println("abstract class-can not be instantiated. have both abstract and non-abstract method");
	}
	
	public void  youTubeFeature() {
		System.out.println("youtube feature-- allow people upload view and share videos.supports live-streaming");
	}
	
	public static void main(String[]args) {
		Iphone1 ip1=new Iphone1();
		ip1.regularClassInfo();
		ip1.youTubeFeature();
		
	}
	
	public int modelYear;
	
	private int price;
	private String info;
	private  char user ;
	private boolean madeInUSA;
	
	
	public Iphone1() {
		modelYear=2000;
		this.price = 765;
		this.info = "default model";
		this.user = 'M';
		this.madeInUSA = true;
		
	}
	
	
	public Iphone1(int price, String info, char user, boolean madeInUSA,int modelYear) {
		super();
		this.modelYear=modelYear;
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	
	public void printInfo() {
		System.out.println("iphone1 model year is :"+ modelYear);
	}
	/*
	 * private variables-these are only accessible within the same class and are hidden from external classes
	 * getters-methods that return the  value of private variables
	 * setters- methods that set the value of a private variables
	 */
	
	public int getmodelYear() {
		return modelYear;
	}
	public void setmodelYear(int modelYear) {
		this.modelYear=modelYear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public char getUser() {
		return user;
	}
	public void setUser(char user) {
		this.user = user;
	}
	public boolean isMadeInUSA() {
		return madeInUSA;
	}
	
	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}
	
	public void displayInfo() {
		System.out.println("i purchased this phone:"+ getmodelYear() +"the price was:"+getPrice()+"user's sex:"+getUser()+
				"made in USA:"+  isMadeInUSA()
	);
		
	}
	

}
