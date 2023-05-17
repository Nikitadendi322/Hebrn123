package service;


import model.Employee;

import java.util.List;

public interface EmployeeDao {
    Integer add(Employee employee);

    Employee getById(int id);

    List<Employee> getAllEmployee();

    Employee updateEmployee(int id, Employee employee);

    void deleteEmployee(Employee employee);



}