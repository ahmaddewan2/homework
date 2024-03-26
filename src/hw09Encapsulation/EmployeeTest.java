package hw09Encapsulation;

public class EmployeeTest {
	
	public static void main(String[]args) {
			
		Employee employee= new Employee();
		employee.setEmployeeName("dewan");
		employee.setEmployeeAge(50);
		employee.setEmployeeGender('M');
		employee.setEmployeeCitizen(false);
			
			
			System.out.println("\nemployee name:"+employee.getEmployeeName()+"\nemployee age:"+employee.getEmployeeAge()+
					"\nemployee gender:"+employee.getEmployeeGender()+"\nis employee citizen?:"+employee.getEmployeeCitizen());
			
			
		}
	}


