package hw15IfElseCondition;

public class Voter {
	
	public static void main(String[]args) {
		int age=60;
		
if (age==18)	{
	System.out.println("i am a voter");
}else if (age<18) {
	System.out.println("i am not a voter");
}else if (age>18) {
	System.out.println("i am a voter from age 18");
}else {
	System.out.println("please add a valid age");
}
		
	}

}
