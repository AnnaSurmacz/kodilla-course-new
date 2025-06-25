package rycerz;

public class App {
    public static void main(String[] args) {
        Quest deadIslandQuest = new DeadIslandQuest();
        Knight knight1 = new Knight (deadIslandQuest);

        Quest eliteKnightQuest = new EliteKnightQuest();
        Knight knight2 = new Knight (eliteKnightQuest);
        knight1.przygoda();
        knight2.przygoda();

    }
}
