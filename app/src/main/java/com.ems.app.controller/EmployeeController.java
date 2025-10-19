package com.ems.app.controller;

import com.ems.app.pojo.ConfirmationForm;
import com.ems.app.pojo.Employee;
import com.ems.app.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;
import java.util.Random;

// A Controller handles web requests. It needs the @Controller annotation.
@Controller
public class EmployeeController {

    // This connects the controller to the database repository.
    @Autowired
    private EmployeeRepo employeeRepo;

    /**
     * This method runs when you go to http://localhost:8080.
     * It prepares the data for the index.html page.
     */
    @GetMapping("/")
    public String viewHomePage(Model model) {
        // Get all employees from the database
        List<Employee> employees = employeeRepo.findAll();
        model.addAttribute("allEmp", employees);

        // Provide an empty Employee object for the "Add Employee" form
        model.addAttribute("employee", new Employee());

        // Provide an empty ConfirmationForm object for the "Delete All" form
        model.addAttribute("confirmationForm", new ConfirmationForm());

        // Return the name of the HTML file to display
        return "index";
    }

    /**
     * This method handles the form submission for creating a new employee.
     */
    @PostMapping("/create")
    public String newEmployee(@ModelAttribute Employee employee) {
        // Create a dynamic Employee ID
        String empId = "EMP";
        Random random = new Random();
        long randomNumber = 1000 + random.nextInt(9000);
        empId = empId + randomNumber;
        employee.setId(empId);

        // Save the new employee to the database
        employeeRepo.save(employee);
        return "redirect:/"; // Go back to the homepage
    }

    /**
     * This method handles updating an existing employee's details.
     */
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee) {
        Optional<Employee> existingEmployee = employeeRepo.findById(employee.getId());
        if (existingEmployee.isPresent()) {
            employeeRepo.save(employee);
        }
        return "redirect:/"; // Go back to the homepage
    }

    /**
     * This method handles the deletion of a single employee.
     */
    @PostMapping("/remove")
    public String removeEmployee(@ModelAttribute Employee employee) {
        Optional<Employee> existingEmployee = employeeRepo.findById(employee.getId());
        if (existingEmployee.isPresent()) {
            employeeRepo.deleteById(employee.getId());
        }
        return "redirect:/"; // Go back to the homepage
    }

    /**
     * This method handles the deletion of all employee records after confirmation.
     */
    @PostMapping("/remove/all")
    public String removeAll(@ModelAttribute ConfirmationForm confirmationForm) {
        if ("Yes".equalsIgnoreCase(confirmationForm.getConfirmation())) {
            employeeRepo.deleteAll();
        }
        return "redirect:/"; // Go back to the homepage
    }
}

