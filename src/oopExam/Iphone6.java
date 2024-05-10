package oopExam;

public class Iphone6 extends Iphone5{
	
	public void compassInfo() {
		System.out.println("Iphone6 has advance compass");
	}

	
	public static void main(String[]args) {
		
		Iphone6 ip6=new Iphone6();
		ip6.compassInfo();
		
	}
	
	/*
	 * method overloading is a concept where multiple methods have the same name but
	 * but different parameters, allow them to perform similarly related but slightly different functions
	 * 
	 * method overriding is a concept where multiple methods have same name and same parameter 
	 * with different syntax
	 * 
	 */
	
	
	public String materials() {
		return "Glass and Alumunium";
		
	}
	public String materials (int ramPrice,int cameraPrice,
			int processorPrice) {
		return( "materials cost -ram:"+ramPrice+",-camera:"+cameraPrice+",-Processor"+processorPrice);
	
	}
	
	public String iphoneInfo() {
		return"iphone 6 -- is a revoulation in smartphone technology";
	}
		
	
		
	}
	
	
	

