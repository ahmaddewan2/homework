package hw10Abstraction;

public interface College {

	// default method
	default void dorm() {
		System.out.println("dorm in college");
	}

	// static method
	static void studyRoom() {
		System.out.println("study room in college");
	}

}
