package toJSON;
import java.util.*;

public class Manager {
	private List<Employee> employeeList;
	
	public Manager(){
		employeeList = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee e){
		employeeList.add(e);
	}
	
	public List<Employee> getEmployeeList(){
		return employeeList;
	}
	
	// returns null if employee is not found
	public Employee getEmployeeByID(int ID){
		for(Employee e:employeeList){
			if(e.getEmployeeID() == ID){
				return e;
			}
		}
		return null;
	}
	
	
	
	
}
