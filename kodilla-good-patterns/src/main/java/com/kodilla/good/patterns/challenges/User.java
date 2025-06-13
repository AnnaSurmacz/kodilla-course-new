package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    public final String phoneNumber;
    public final String eMailAdress;


    public User(String name, String surname, final String phoneNumber, final String eMailAdress) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.eMailAdress = eMailAdress;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String phoneNumber() {
        return phoneNumber;
    }
    public String eMailAdress() {
        return eMailAdress;
    }
}
