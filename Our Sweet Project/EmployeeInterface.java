
import java.lang.*;

public interface EmployeeInterface
{
	boolean insertEmployee(Employee emp);
	boolean removeEmployee(Employee emp);
	Employee searchEmployee(String empId);
	void showAllEmployees();
}