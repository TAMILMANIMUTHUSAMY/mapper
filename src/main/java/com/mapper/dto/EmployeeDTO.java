package com.mapper.dto;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 11-06-2019 23:30
 */
public class EmployeeDTO {

    private String empName;
    private Integer empAge;
    private Sex empSex;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Sex getEmpSex() {
        return empSex;
    }

    public void setEmpSex(Sex empSex) {
        this.empSex = empSex;
    }
}
