package com.hb.spring.data.jpa.tutorial.repository;


import com.hb.spring.data.jpa.tutorial.entity.Course;
import com.hb.spring.data.jpa.tutorial.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}
