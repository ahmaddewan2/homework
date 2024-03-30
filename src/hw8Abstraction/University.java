package hw8Abstraction;

public interface University {

	public void classSize();

	public void playGround();

	public void teacher();

	// it is not possible to create a constructor inside interface.constructors are
	// meant for instantiating concrete classes,
	// since interface can not be instantiated on their own,so no concept of
	// constructor in interface
}
