package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.EmployeeDAO;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController {
	
	@RequestMapping(value="/getAllEmployees",method=RequestMethod.GET)
	public String welcome(Model model) {
		EmployeeDAO ed = new EmployeeDAO();
		model.addAttribute("employees",ed.getAllEmployees());
		return "Home";
	}
	
	
}
