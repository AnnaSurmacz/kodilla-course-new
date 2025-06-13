package factorialtask;

public class factorial {

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

/*    public static void main(String[] args) {
        int wynik = factorial(7);
        System.out.println("Silnia z 7 to: " + wynik);
    }
    */

}
