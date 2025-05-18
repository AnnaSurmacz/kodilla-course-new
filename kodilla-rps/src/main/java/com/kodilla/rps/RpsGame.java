package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj swoje imię:");
        String imie = scanner.nextLine();

        System.out.println("Podaj liczbę rund:");
        int liczbaRund = scanner.nextInt();
        scanner.nextLine();

        int wygraneGracza = 0;
        int wygraneKomputera = 0;

        for (int i = 1; i <= liczbaRund; i++) {
            System.out.println("Runda: " + i + " wybierz: 1-Papier, 2-Kamień, 3-Nożyce, n-Nowa gra, x-Zakończ grę");
            String ruchGracza = scanner.nextLine();




            if (ruchGracza.equals("n")) {
                System.out.println("Czy na pewno chcesz rozpocząć nową grę? Wpisz tak lub nie");
                String czyNowaGra = scanner.nextLine();
                if (czyNowaGra.equalsIgnoreCase("tak")) {
                    System.out.println("Rozpoczynamy nową grę!");
                    start();
                    return;
                } else {
                    System.out.println("Gramy dalej.");
                    i--;
                    continue;
                }
            }


            if (ruchGracza.equals("x")) {
                System.out.println("Czy na pewno chcesz zakończyć grę? Wpisz tak lub nie");
                String czyZakonczyc = scanner.nextLine();
                if (czyZakonczyc.equalsIgnoreCase("tak")) {
                    System.out.println("Kończymy grę!");
                    break;
                } else {
                    System.out.println("Gramy dalej.");
                    i--;
                    continue;
                }
            }


            if (!ruchGracza.equals("1") && !ruchGracza.equals("2") && !ruchGracza.equals("3") &&
                    !ruchGracza.equals("n") && !ruchGracza.equals("x")) {
                System.out.println("Błędny wybór - runda przepadła");
                continue;
            }

            int ruchGraczaInt = Integer.parseInt(ruchGracza);
            int ruchKomputera = random.nextInt(3) + 1;

            if (ruchKomputera == 1) {
                System.out.println("Komputer wybrał Papier");
            } else if (ruchKomputera == 2) {
                System.out.println("Komputer wybrał Kamień");
            } else if (ruchKomputera == 3) {
                System.out.println("Komputer wybrał Nożyce");
            }

            if (ruchGraczaInt == 1) {
                System.out.println("Wybrałeś: Papier");
            } else if (ruchGraczaInt == 2) {
                System.out.println("Wybrałeś: Kamień");
            } else if (ruchGraczaInt == 3) {
                System.out.println("Wybrałeś: Nożyce");
            }


            if ((ruchGraczaInt == 1 && ruchKomputera == 2) ||
                    (ruchGraczaInt == 2 && ruchKomputera == 3) ||
                    (ruchGraczaInt == 3 && ruchKomputera == 1)) {
                wygraneGracza++;
                System.out.println("Wygrałeś rundę - zdobywasz jeden punkt. Łączna liczba punktów: " + wygraneGracza);
            } else if (ruchGraczaInt == ruchKomputera) {
                System.out.println("Remis");
            } else {
                System.out.println("Komputer wygrał rundę");
                wygraneKomputera++;
            }
        }

        System.out.println("Koniec gry! Wynik: Ty " + wygraneGracza + " : " + wygraneKomputera + " Komputer");
        if (wygraneGracza > wygraneKomputera) {
            System.out.println("Gratulacje, wygrałaś!");
        } else if (wygraneKomputera > wygraneGracza) {
            System.out.println("Komputer wygrał!");
        } else {
            System.out.println("Remis!");
        }
    }
}