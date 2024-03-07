package hw5JavaMethods;

public class FullName {


	public String fullName(String fName, String lName) {
		String fullName = fName +" "+ lName;
		System.out.println("Family Member: " + fullName);

		return fullName;

	}

	public static void main(String[] args) {
		FullName fullName = new FullName();

		fullName.fullName("toni","kobi");
		fullName.fullName("alex","john");
		fullName.fullName("jhony", "peter");
		fullName.fullName("michael","bevan");
		fullName.fullName("md","khan");
		

	}

}
