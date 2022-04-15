package com.Omerkhan.DEMOCRUDAPP.Service;

import com.Omerkhan.DEMOCRUDAPP.Model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
