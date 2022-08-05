package com.djurayevumid.application.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;
    @Column(name = "Department")
    private String department;
    @Column(name = "Salary")
    private int salary;
    @Column(name = "E_Mail")
    private String email;
    @Column(name = "Family_Stand")
    private String familyStand;
    @Column(name = "address")
    private String address;


    @Column(name = "Phone_number")
    private long phoneNumber;

    public User() {
    }

    public User(String name, String surname, String department, int salary, String email, String familyStand, String address, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.familyStand = familyStand;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFamilyStand() {
        return familyStand;
    }

    public void setFamilyStand(String familyStand) {
        this.familyStand = familyStand;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return salary == user.salary && phoneNumber == user.phoneNumber && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(department, user.department) && Objects.equals(email, user.email) && Objects.equals(familyStand, user.familyStand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, department, salary, email, familyStand, phoneNumber);
    }
}
