package br.edu.mystudies.application;

public class Bank {
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(String accountNumber, long balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int value) {
        this.balance = this.balance + value;
    }

    public void withdraw(int value) {
        if (value > balance) {
            System.out.println("You don't have enough funds.");
        } else {
            this.balance = this.balance - value;
        }
    }
}
