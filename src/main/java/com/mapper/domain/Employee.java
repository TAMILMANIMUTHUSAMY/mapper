package com.mapper.domain;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 11-06-2019 23:30
 */
public class Employee {

    private String firstName;
    private String lastName;
    private Integer age;
    private Sex sex;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
