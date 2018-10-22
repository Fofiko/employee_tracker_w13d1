package com.codeclan.lab.EmployeeTracker.Controllers;

import com.codeclan.lab.EmployeeTracker.Models.Employee;
import com.codeclan.lab.EmployeeTracker.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "{employeeNumber}", method = RequestMethod.GET)
    public Employee getEmployeeNumber(@PathVariable String employeeNumber) {
        Integer id = Integer.valueOf(employeeNumber);
        if (!employeeRepository.findById(id).isPresent()) {
            return employeeRepository.;
        }
        return employeeRepository.findById(id).get();
    }

    //same as above but with GetMapping:
//    @GetMapping(value = "{employeeNumber}")




    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
