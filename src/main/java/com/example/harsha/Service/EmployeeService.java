package com.example.harsha.Service;

import com.example.harsha.Entity.DTO.EmployeeDTO;
import com.example.harsha.Entity.EmployeeEntity;
import com.example.harsha.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<EmployeeEntity> getAllEmployee() {
        List<EmployeeEntity> allEmployeelist = employeeRepository.findAll();
        return allEmployeelist;
    }
    public EmployeeEntity getEmployee(Integer id){
    EmployeeEntity employeeEntity= employeeRepository.findByEmployeeId(id);
    return employeeEntity;
    }
    public EmployeeEntity postEmployees(EmployeeEntity employee){
        return employeeRepository.save(employee);
    }


    public ResponseEntity updateEmployee(EmployeeDTO employeeEntity) {
        EmployeeEntity employee = employeeRepository.findByEmployeeId(employeeEntity.getEmployeeId());

        employee.setName(employeeEntity.getName());
        employee.setDob(employeeEntity.getDob());
        employee.setEmail(employeeEntity.getEmail());
        employee.setPhoneno(employeeEntity.getPhoneno());
        employeeRepository.save(employee);
     return new ResponseEntity<>(200, HttpStatus.valueOf("successfully updated"));
    }
    public Map<String, Boolean> deleteEmployee(Integer employeeId)
    {
        EmployeeEntity employee = employeeRepository.findAll().get(employeeId);

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

