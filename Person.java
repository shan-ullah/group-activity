package groupActivity6;

class Person {

	private String name;
	private int age;
	private int contactNumber;
	private String address;
	private double salary;
	
	void displaySalary() {
		System.out.println(salary);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



}

class Employee extends Person{
	private String specialization;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String toString() {
		return "Name : " + getName() + "\nAddress : " + getAddress() + "\nAge : " + getAge() +
				"\nPhone number" + getContactNumber() + "\nSalary: " + getSalary();
	}
	
	
}

class Manager extends Person{
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	public String toString() {
		return "Name : " + getName() + "\nAddress : " + getAddress() + "\nAge : " + getAge() +
				"\nPhone number" + getContactNumber() + "\nSalary: " + getSalary();
	}
	
	
	
	
}
