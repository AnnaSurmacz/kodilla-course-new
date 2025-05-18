package BMI;

public class CalculatorBMI {
    private double masa;
    private double wzrost;

    public CalculatorBMI(double masa, double wzrost) {
        this.masa = masa;
        this.wzrost = wzrost;
    }

    public double obliczBMI() {
        return masa / ((wzrost/100) * (wzrost/100));
    }

    public String ocenaBMI() {
        double bmi = obliczBMI();
        if (bmi < 18.5) {
            return "Niedowaga";
        } else if (bmi < 25) {
            return "Waga prawidłowa";
        } else if (bmi < 30) {
            return "Nadwaga";
        } else {
            return "Otyłość";
        }
    }
}