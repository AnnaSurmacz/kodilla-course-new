package srednia;

public class average {
    public static void main(String[] args) {


        int[] numbers = new int[20];
        numbers[0] = 13;
        numbers[1] = 14;
        numbers[2] = 15;
        numbers[3] = 16;
        numbers[4] = 17;
        numbers[5] = 18;
        numbers[6] = 19;
        numbers[7] = 20;
        numbers[8] = 21;
        numbers[9] = 22;
        numbers[10] = 23;
        numbers[11] = 24;
        numbers[12] = 25;
        numbers[13] = 26;
        numbers[14] = 27;
        numbers[15] = 28;
        numbers[16] = 29;
        numbers[17] = 30;
        numbers[18] = 31;
        numbers[19] = 32;

        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        double srednia = (double)suma/ numbers.length;
        System.out.println("Srednia wynosi:" + srednia);
    }
}
