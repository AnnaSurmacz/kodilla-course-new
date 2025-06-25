package walidacjaWieku;

public class App {
    public static void main(String[] args) {
      UserValidator validator = new UserValidator(16, 'f');
     int age1 = validator.getAge();
     char sex1 = validator.getSex();

     validator.validateAge();

     if (age1 > 15) {
         validator.validateSex();
         System.out.println ("Wiek jest ok: " + age1 + "płeć to"+ sex1);
     }else {
         System.out.println("Too young");
     }
    }
}
