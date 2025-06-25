package dziedziczenie;

public class Dog extends Animal {
    private String rasa;

    public Dog(String rasa, int age, int weight, int height, String name) {
        super(age, weight, height, name);
        this.rasa = rasa;

    }
    public String getRasa() {
        return rasa;
    }
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}