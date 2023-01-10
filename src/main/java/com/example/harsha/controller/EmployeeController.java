package com.example.harsha.controller;

import com.example.harsha.Entity.DTO.EmployeeDTO;
import com.example.harsha.Entity.EmployeeEntity;
import com.example.harsha.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    public List<EmployeeEntity> getAllEmployee(){
      return employeeService.getAllEmployee();

    }

    @GetMapping("/getEmployee")
    public EmployeeDTO getEmployeesById(@RequestParam Integer id){
           EmployeeDTO employeeDTO=new EmployeeDTO();
        EmployeeEntity employee= employeeService.getEmployee(id);
        employeeDTO.setName(employee.getName());
        employeeDTO.setPhoneno(employee.getPhoneno());
        employeeDTO.setDob(employee.getDob());
        employeeDTO.setEmail(employee.getEmail());
        return employeeDTO;

    }
    @PostMapping("/createEmployees")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {

        return employeeService.postEmployees(employee);
    }

    @PutMapping("/updateEmployees")
    public ResponseEntity updateEmployee(@RequestBody EmployeeDTO employee) {
      return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("deleteEmployees")
    public Map<String, Boolean> deleteEmployee(@RequestParam Integer employeesId){
        return employeeService.deleteEmployee(employeesId);
    }

}
