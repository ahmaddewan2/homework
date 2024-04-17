package hw18JavaSwitch;

import java.util.Scanner;

public class LevelOfJava {
	public static void main(String[]args) {
		System.out.println("<-- Please Write about your Java level -->");
		Scanner scanner=new Scanner(System.in);
		String myLevel=scanner.nextLine();
switch (myLevel) {
case "beginner":
	System.out.println("i am at the beginning level");
	
	break;
case "intermediate":
	System.out.println("i am at the intermediate level");
	
	break;
case "expert" :
	System.out.println("i am at the expert level");
	
	break;
case "excellent" :
	System.out.println("i have a java certification from oracle");
	
	break;

default:
	System.out.println("i am a drop out");
	break;
}		
	scanner.close();	
		
	}

}
