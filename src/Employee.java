
public class Employee {

	private int employeeID;
	private int companyID;
	private String employeeName;
	private String password;
//	private String email;
	
	
	public Employee(int employeeID, int companyID, String employeeName, String password, String email) {
		this.employeeID = employeeID;
		this.companyID = companyID;
		this.employeeName = employeeName;
		this.password = password;
//		this.email = email;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public int getCompanyID() {
		return companyID;
	}
	
	public String employeeName() {
		return employeeName;
	}
	
	public String password() {
		return password;
	}
	
}
