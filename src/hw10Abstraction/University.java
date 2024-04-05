package hw10Abstraction;

public interface University {
	// default method
	default void gymnasium() {
		System.out.println("this defaukt method is inside the interface");
	}

	// static method
	static void library() {
		System.out.println("this static method is inside interface");
	}

	/*
	 * two keywords are used for inheritance in interface-"Extends" & "Implements"
	 * interface can inherit more than one interface by extends keyword interface
	 * can not inherit regular or abstract class by extends keyword more than one
	 * inheritance are possible by an interface
	 */
	// MedicalSchool extends NursingSchool implements LawSchool
	/*
	 * two keywords are used for inheritance in abstract class -"Extends" &
	 * "Implements" by extend keyword abstract class can inherit another abstract
	 * class and regular class but by implements keyword abstract class can inherit
	 * more than one interface more than one inheritance is possible by one abstract
	 * class
	 */
	// ColumbiaUniversity extends MedicalSchool implements University,
	// VocationalSchool
	/*
	 * two keywords are used for inheritance in regular class -"Extends" &
	 * "Implements" by extend keyword regular class can inherit another abstract
	 * class and regular class but by implements keyword regular class can inherit
	 * more than one interface more than one inheritance are possible by a regular
	 * class
	 */
}
