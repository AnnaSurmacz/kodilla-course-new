package bankomat;

public interface ATM {
    void wplata();
    void wyplata();

    default void connectedToBank () {
        System.out.println("Polaczono z bankiem");
    }
    static String endOfConnecting() {
        return "end of connecting";
    }

}
