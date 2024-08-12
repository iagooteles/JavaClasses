package br.edu.mystudies.application;

public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }

    public Customer() {
        this("none", 0, "none");
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
