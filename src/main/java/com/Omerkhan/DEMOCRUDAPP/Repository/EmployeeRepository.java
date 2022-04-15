package com.Omerkhan.DEMOCRUDAPP.Repository;

import com.Omerkhan.DEMOCRUDAPP.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
