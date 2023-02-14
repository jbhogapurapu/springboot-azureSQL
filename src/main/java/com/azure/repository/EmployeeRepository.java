/**
 * 
 */
package com.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.entity.Employee;

/**
 * @author jbhogapurapu
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
