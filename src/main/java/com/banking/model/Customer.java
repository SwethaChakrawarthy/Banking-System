package com.banking.model;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private int id;
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    public Customer(String name, String email, String phone ) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

}
