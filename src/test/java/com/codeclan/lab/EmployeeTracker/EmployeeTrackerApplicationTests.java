package com.codeclan.lab.EmployeeTracker;

import com.codeclan.lab.EmployeeTracker.Models.Employee;
import com.codeclan.lab.EmployeeTracker.Repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createAndSaveEmployee(){
		Employee employee1 = new Employee("Rupert", 50, "rupahrappah@msn.com");
		Employee employee2 = new Employee("Shoshanna", 40, "shosho@hotmail.com");
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}

}
