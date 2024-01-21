package com.java.jdbc.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private String county;
    private String town;
    private String address;
    private String phone;
    private String email;

    public Student(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public String toString_id_firstname(){
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", county='" + county + '\'' +
                ", town='" + town + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
