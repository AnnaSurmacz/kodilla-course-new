package dziedziczenie;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("maltańczyk", 7, 3, 30, "Pucio");

    dog.picie();
    dog.jedzenie();

    int WiekPusi = dog.getAge();
    String ImiePucia= dog.getName();

    System.out.println(ImiePucia + "ma: "+ WiekPusi + "lat");
}
}