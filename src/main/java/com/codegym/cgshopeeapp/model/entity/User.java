package com.codegym.cgshopeeapp.model.entity;

public class User {
    private String email;
    private String name;
    private String password;

    private String verifyCode;
    private boolean status;
    private String address;

    private String phoneNumber;
    private String dateOfBirth;
    private String gender;

    private String role;

    public User() {
    }

    public User(String email, String password, String verifyCode, boolean status) {
        this.email = email;
        this.name = email;
        this.password = password;
        this.verifyCode = verifyCode;
        this.role = "Customer";
        this.status = status;
    }


    public User(String email, String password, String nameUser , String gender , String dateOfBirth , String phoneNumber, String role, String verifyCode , String address, boolean status) {
        this.email = email;
        this.name = nameUser;
        this.password = password;
        this.verifyCode = verifyCode;
        this.status = status;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                ", status=" + status +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
