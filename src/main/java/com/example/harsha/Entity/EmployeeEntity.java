package com.example.harsha.Entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
    public class EmployeeEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer employeesId;

        @Column(name = "name",nullable = false)
        private String name;

        @Column(name = "dob",nullable = false)
        private String dob ;

        @Column(name = "email",nullable = false)
        private String email;

        @Column(name = "phoneno",nullable = false)
        private String phoneno;


    public EmployeeEntity(){

    }

        public EmployeeEntity(Integer employeesId, String name, String dob, String email, String phoneno) {
            this.employeesId = employeesId;
            this.name = name;
            this.dob = dob;
            this.email = email;
            this.phoneno = phoneno;
        }

        public Integer getEmployeesId() {
            return employeesId;
        }

        public void setEmployeesId(Integer employeesId) {
            this.employeesId = employeesId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneno() {
            return phoneno;
        }

        public void setPhoneno(String phoneno) {
            this.phoneno = phoneno;
        }

        @Override
        public String toString() {
            return "EmployeeEntity{" +
                    "employeesId=" + employeesId +
                    ", name='" + name + '\'' +
                    ", dob='" + dob + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneno='" + phoneno + '\'' +
                    '}';
        }
    }

