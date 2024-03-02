package hw4Constructor;

public class StudentTest {

	public static void main(String[] args) {// default constructor initialized

		Student student = new Student();

		Student student1 = new Student();
		Student student2 = new Student("Alexy", 4354, true, 2.78f, 'M');
		Student student3 = new Student("kobi", 5647, true, 3.67f, 'M');
		Student student4 = new Student("robi", 5643, true, 2.9f, 'M');
		Student student5 = new Student("toni", 6754, true, 3.33f, 'M');

	}

}


