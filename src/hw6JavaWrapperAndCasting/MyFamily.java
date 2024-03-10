package hw6JavaWrapperAndCasting;

public class MyFamily {

	float child1Age = 1.5f;
	int child2Age = 2;
	double child3Age = 3.564783;
	int child4Age = 4;

	public int myFamily() {
		int myChild1Age = (int) child1Age;
		int myChild3Age = (int) child3Age;
		int sum = (int) (child1Age + child2Age + child3Age + child4Age);
		System.out.println("The sum of the children age is:" + sum);
		return sum;
	}

	public static void main(String[] args) {

		MyFamily myFamily = new MyFamily();
		myFamily.myFamily();
	}

}
