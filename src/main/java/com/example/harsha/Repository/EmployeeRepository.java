package com.example.harsha.Repository;

import com.example.harsha.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{
    @Query("Select a from EmployeeEntity a where employeesId=?1")
    EmployeeEntity findByEmployeeId(Integer employeeId);


}
