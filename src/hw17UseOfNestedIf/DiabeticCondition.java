package hw17UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<-- Please Enter your Hemoglobin A1C value below -->");
		Scanner scanner=new Scanner(System.in);
		double HemoglobinA1C=scanner.nextDouble();
if(HemoglobinA1C>6.4) {
	System.out.println("i am a diabetic patient");
}else if(HemoglobinA1C<6.4)
	if (HemoglobinA1C>=5.7) {
		System.out.println("i am a pre-diabetic patient");
	}else if (HemoglobinA1C<5.7) {
		System.out.println("i am a healthy person");
	}else {
		System.out.println("congratulations! you are not a diabetic patient");
	}
		
	scanner.close();	

	}

}
