package com.example.DataIntegrityException.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.CollectionIdMutability;

@Entity
@Table(name = "MembersData")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    int id;
    @Column(name = "UserName",unique = true,nullable = false)
    @NotEmpty(message = "UserName Cannot be empty!")
    String username;
    @Column(name = "Name",nullable = false)
    @NotEmpty(message = "Please Provide An Name!")
    String name;
    @Column(name ="Phone No",unique = true,nullable = false)
    @NotNull(message = "Phone No Cannot be Empty!")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$",message = "Please enter An Valid Phone No")
    String phone;
    @Column(name= "AccountNo",unique = true,nullable = false)
    @NotEmpty(message = "Please your Account no!")
    @Pattern(regexp = "^[0-9]{9,16}",message = "Please Enter An Valid Account No!")
    String accNo;

    public Members(int id, String username, String name, String phone, String accNo) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.accNo = accNo;
    }

    public Members() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
}
