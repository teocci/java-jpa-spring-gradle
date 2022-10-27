package com.github.teocci.javajpaspringgradle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "employees")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "dob", nullable = false)
    private Date dob;

    @Column(name = "department_id", nullable = false)
    private Long departmentId;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}


    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() {return lastName;}

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Date getDob()
    {
        return dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public Long getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId)
    {
        this.departmentId = departmentId;
    }

    @Override
    public String toString()
    {
        return String.format("Employee [id=%d, firstName=%s, lastName=%s, emailId=%s]", id, firstName, lastName, email);
    }
}