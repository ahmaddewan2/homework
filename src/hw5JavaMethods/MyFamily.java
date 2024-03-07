package hw5JavaMethods;

public class MyFamily {
	int child1Age = 1;
	int child2Age = 2;
	int child3Age = 3;
	int child4Age = 4;

	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of the children age is:" + sum);
		return sum;
	}

	public static void main(String[] args) {
		MyFamily myFamily = new MyFamily();
		myFamily.myFamily();
	}

}
