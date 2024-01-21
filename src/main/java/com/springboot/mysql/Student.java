package com.springboot.mysql;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String county;
    private String town;
    private String address;
    private String phone;
    private String email;

    public Student(String firstName, String email, String county) {
        this.firstName = firstName;
        this.email = email;
        this.county = county;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student" +
                "\n\tid: " + id +
                "\n\tfirstName= " + firstName +
                "\n\tlastName= " + lastName +
                "\n\tcounty= " + county +
                "\n\ttown= " + town +
                "\n\taddress= " + address +
                "\n\tphone= " + phone  +
                "\n\temail= " + email ;
    }
}
