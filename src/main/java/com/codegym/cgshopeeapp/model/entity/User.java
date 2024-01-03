package com.codegym.cgshopeeapp.model.entity;

import java.sql.Date;

public class User {
    private String emailUser;
    private String nameUser;
    private String passwordUser;

    private String verifyCode;
    private boolean status;
    private String addressUser;

    private String phoneNumber;
    private Date dateOfBirth;
    private String gender;

    private String role;

    public User() {
    }

    public User(String emailUser, String passwordUser, String verifyCode, boolean status) {
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.verifyCode = verifyCode;
        this.status = status;
    }

    public User(String emailUser, String nameUser, String passwordUser, String verifyCode, boolean status, String addressUser, String phoneNumber, Date dateOfBirth, String gender) {
        this.emailUser = emailUser;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.verifyCode = verifyCode;
        this.status = status;
        this.addressUser = addressUser;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public User(String emailUser, String nameUser, String passwordUser, String verifyCode, boolean status, String addressUser, String phoneNumber, Date dateOfBirth, String gender, String role) {
        this.emailUser = emailUser;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.verifyCode = verifyCode;
        this.status = status;
        this.addressUser = addressUser;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.role = role;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
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

    public String getAddressUser() {
        return addressUser;
    }

    public void setAddressUser(String addressUser) {
        this.addressUser = addressUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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
                "emailUser='" + emailUser + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                ", status=" + status +
                ", addressUser='" + addressUser + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
