package bankomat;

public class App {
    public static void main(String[] args) {
        ATM euro = new Euro();
        ATMImpl atmimpl1 = new ATMImpl(euro);

        atmimpl1.proceswyplaty();
        atmimpl1.proceswyplaty();

        ATM pln = new PLN();
        ATMImpl atmimpl2 = new ATMImpl(pln);

        atmimpl2.proceswyplaty();
        atmimpl2.proceswyplaty();
        // WYWOŁANIE metody default na obiekcie:
        euro.connectedToBank();
        pln.connectedToBank();

        // WYWOŁANIE metody statycznej:
        System.out.println(ATM.endOfConnecting());


    }
}
