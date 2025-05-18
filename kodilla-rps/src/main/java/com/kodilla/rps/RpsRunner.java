package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("Witaj w grze Papier, Kamień, Nożyce!");
        System.out.println("Zasady gry:");
        System.out.println("Wybierz 1 - Papier");
        System.out.println("Wybierz 2 - Kamień");
        System.out.println("Wybierz 3 - Nożyce");
        System.out.println("Wybierz x - Zakończ grę");
        System.out.println("Wybierz n - Nowa gra");
        System.out.println("Remis: ten sam ruch u obu graczy.");
        System.out.println("Kamień bije nożyce, nożyce tną papier, papier przykrywa kamień.");
        System.out.println();

        RpsGame game = new RpsGame();
        game.start();


    }
}
