package com.Employee.register.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class employeeentity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private String emailid;

        @Column(nullable = false)
        private String position;
        @Column(nullable = false)
        private long phonenumber;

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public employeeentity(long id, String name, String emailid, String position, long phonenumber) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
        this.position = position;
        this.phonenumber = phonenumber;
    }

    public employeeentity() {
    }
}
