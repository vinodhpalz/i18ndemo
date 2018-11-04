package model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

		public List<Employee> getAllEmployees()
		{
			List<Employee> empl = new ArrayList<Employee>();
			
			Employee e1 = new Employee();
			e1.setId(1);
			e1.setFirstName("Vinodh");
			e1.setLastName("PL");
			
			Employee e2 = new Employee();
			e2.setId(2);
			e2.setFirstName("Saurabh");
			e2.setLastName("Tiwary");
			
			empl.add(e1);
			empl.add(e2);
			
			return empl;
		}
}
