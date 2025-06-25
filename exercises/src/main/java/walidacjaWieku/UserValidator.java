package walidacjaWieku;

public class UserValidator {
    private int age;
    private char sex;

    public UserValidator(int age, char sex) {
        this.age = age;
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public char getSex() {
    return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void validateAge() {
        if (age <= 15) {
            System.out.println("too young");
        }else {
            System.out.println("it's ok");
        }
    }
    public void validateSex() {
        if (sex == 'f'){
            System.out.println("female");
        } else if (sex=='m'){
            System.out.println("male");
        } else {
            System.out.println("unknown");
        }
    }
}
