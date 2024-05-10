package oopExam;

public interface Phone extends Pager,Wakitoki{

/*Interface is a Blueprint of Class. 
 * Interface cannot be instantiated and it cannot create object.
 * Contains only abstract methods.
 * Abstract method can not be implemented, can be defined  (declared) only
 * interface contains default and static method only which are non abstract(exception)
 * 
 */

//phone interface can not inherit regular class(landphone) and abstract class(satelitephone)
//phone interface can inherit interface pager and wakitoki


	void makeCall();

	void sendMessage();

	void takePhotoByCamera();

	void interfaceInfo();

	/*
	 * interface can not have variables but they can have only static and final
	 * variables interface can not have constructor too as they can not represent
	 * object ,so they can not be instantiated.
	 * 
	 */

	default void battery() {
		System.out.println("battery is a default void method from java 8");

	}

	default void wireless() {
		System.out.println("wireless connection is established by default");
	}
}
