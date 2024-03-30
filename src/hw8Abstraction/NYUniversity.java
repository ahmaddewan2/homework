package hw8Abstraction;

public class NYUniversity {
	
	public void anthropology() {
		System.out.println("this is a non-abstract method");
	}
	
	public static void main(String[]args) {
		NYUniversity nyuniversity=new NYUniversity();
		nyuniversity.anthropology();
	}

}
