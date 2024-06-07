package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	public void configurationOfIphone6() {
		System.out.println("this is a void method");
	}

	// overriding the materials () method

	@Override
	public String materials() {
		return "Glass and Alumunium";
	}

	@Override
	public String materials(int ramPrice, int cameraPrice, int processorPrice) {
		return ("eco materials cost -ram:" + ramPrice + ",-camera:" + cameraPrice + ",-Processor-discount"
				+ processorPrice);

	}

	public String iphoneInfo() {
		return "configured iphone 6 -- is eco-friendly and advance recycling technology";
	}

}
