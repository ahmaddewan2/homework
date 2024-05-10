package oopExam;

public interface DigitalWatch {
	default void alarmTime() {
		System.out.println("please set the alarm time");
	}

}
