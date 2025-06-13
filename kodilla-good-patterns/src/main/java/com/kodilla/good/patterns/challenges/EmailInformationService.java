package com.kodilla.good.patterns.challenges;


public class EmailInformationService implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Wiadomość e-mail została wysłana na adres: " + user.eMailAdress());
    }
}