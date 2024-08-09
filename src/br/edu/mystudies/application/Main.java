package br.edu.mystudies.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank myBank = new Bank("112233", 1000, "iagoo",
                "iagoo@test.com", "85858585");

        String email = myBank.getEmail();
        myBank.deposit(30000);
        long myBalance = myBank.getBalance();

        System.out.println("My balance: " + myBalance);
        System.out.println("my bank account email = " + email);
    }
}