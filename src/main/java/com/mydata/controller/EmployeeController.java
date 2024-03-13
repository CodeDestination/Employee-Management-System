package com.mydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.Service.EmployeeService;
import com.mydata.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/addemployee")
	public String openaddempform(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		return "addemployee.html";

	}

	@PostMapping("/saveemployee")
	public String AddEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}

	@GetMapping("/employees")
	public String viewallemployee(Model model) {
		List<Employee> emplist = employeeService.viewallemployee();
		model.addAttribute("emp", emplist);
		return "employess.html";

	}

	@GetMapping("/employees/{id}")
	public String deletebyid(@PathVariable int id) {
		employeeService.deletebyid(id);
		return "redirect:/employees";

	}

	@GetMapping("/employees/edit/{id}")
	public String Openupdateempform(Model model, @PathVariable int id) {
		Employee emp = employeeService.getemployeebyid(id);
		model.addAttribute("emp", emp);
		return "editemployee.html";

	}

	@PostMapping("/updateemployee/{id}")
	public String updateEmployee(@PathVariable int id, @ModelAttribute Employee e) {
		employeeService.updateemployee(id, e);
		return "redirect:/employees";

	}
}


