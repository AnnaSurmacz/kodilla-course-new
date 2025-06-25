package bankomat;

public class ATMImpl {
    private ATM atm;

    public ATMImpl(ATM atm) {
        this.atm = atm;
    }
    public void proceswplaty() {
        System.out.println("ATM process started");
        this.atm.wplata();
        System.out.println("ATM process finished");
    }
    public void proceswyplaty() {
        System.out.println("ATM process started");
        this.atm.wyplata();
        System.out.println("ATM process finished");
    }
}
