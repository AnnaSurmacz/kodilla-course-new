package dziedziczenie;

public class Animal {
    private int age;
    private int weight;
    private int height;
    private String name;

    public Animal(int age, int weight, int height, String name) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;

    }
public int getAge() {
        return age;
}
public void setAge(int age) {
        this.age = age;
}
public int getWeight() {
        return weight;
}
public void setWeight(int weight) {
        this.weight = weight;
}
public int getHeight() {
        return height;
}
public void setHeight(int height) {
        this.height = height;
}
public String getName() {
        return name;
}
public void setName(String name) {
        this.name = name;
}

public void picie(){
}
public void jedzenie(){
}


}
