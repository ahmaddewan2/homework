package hw10Abstraction;

public interface Hospital {
	// default method
	default void morgue() {
		System.out.println("morgue in hospital");
	}

	// static method
	static void pharmacy() {
		System.out.println("pharmacy in hospital");
	}

}
