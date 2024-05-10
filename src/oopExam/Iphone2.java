package oopExam;

public class Iphone2 extends Iphone1 {
	
	char userOfIphone2='M';
	
	
	
	
	

	public Iphone2(char userOfIphone2,int modelYear) {
		super();
		this.userOfIphone2 = userOfIphone2;
	}
	
	public Iphone2() {
		super();
		
		this.userOfIphone2 ='M';
		

}
	
	
	public void iphone2() {
		super.getInfo();
		System.out.println("user type of iphone2:"+ userOfIphone2);
		
	}
	
	public void iphone2Info() {
		super.printInfo();
		System.out.println("user type of iphone2:"+ userOfIphone2);
	}
	
	public void iphone2Info(char userOfIphone2,int modelYear) {
		super.getInfo();
		System.out.println("this is a parameterized  method");
	}
	
	public void  dropboxFeature() {
		System.out.println("dropbox feature-- allow people upload view and  videos.");
	}
	
	
}
