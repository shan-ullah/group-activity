package groupActivity6;

public class Q1 {

	public static void main(String[] args) {

		Employee employee = new Employee();
	
		employee.setName("adam");
		employee.setAge(30);
		employee.setAddress("123 street,city,country");
		employee.setContactNumber(123455677);
		employee.setSalary(12345);
		employee.setSpecialization("accounting");
		
		
		Manager manager = new Manager();
		manager.setName("steve");
		manager.setAge(35);
		manager.setAddress("456 new street, new city, new country");
		manager.setContactNumber(1987654);
		manager.setSalary(987654);
		manager.setDepartment("finance");
		
		System.out.println("Employee:");
		System.out.println(employee.toString());
		
		System.out.println("\n\nManager:");
		System.out.println(manager.toString());
	}
	

}
