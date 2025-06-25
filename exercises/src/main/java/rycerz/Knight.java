package rycerz;

public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }
public void przygoda(){
        System.out.println("czas na przygode");
        quest.process();

}

}
