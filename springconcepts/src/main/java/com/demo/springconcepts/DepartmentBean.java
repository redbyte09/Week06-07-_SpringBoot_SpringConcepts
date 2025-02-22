package com.demo.springconcepts;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "IT";

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}