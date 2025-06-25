package Obiekty;

public class App {
    public static void main(String[] args) {
        User user = new User("Adam", 29, 187);
        System.out.println("Zaczynamy...");
        String name1 = user.getName();
        double age1 = user.getAge();
        double height1 = user.getHeight();


        if (name1 != null) {
            if (age1 > 30 && height1 > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}

