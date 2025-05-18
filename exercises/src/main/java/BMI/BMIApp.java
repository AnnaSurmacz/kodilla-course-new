package BMI;

import java.util.Scanner;

public class BMIApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj masę ciała w kg: ");
        double masa = scanner.nextDouble();

        System.out.print("Podaj wzrost w cm: ");
        double wzrost = scanner.nextDouble();

        CalculatorBMI kalkulator = new CalculatorBMI(masa, wzrost);

        double bmi = kalkulator.obliczBMI();
        String ocena = kalkulator.ocenaBMI();

        System.out.printf("Twoje BMI: ", bmi);
        System.out.println("Kategoria: " + ocena);
    }
}