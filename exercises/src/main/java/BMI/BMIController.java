package BMI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {

    @FXML
    private TextField masaField;

    @FXML
    private TextField wzrostField;

    @FXML
    private Label wynikBMI;

    @FXML
    private Label ocenaBMI;

    @FXML
    private void obliczBMI() {
        try {

            int masa = Integer.parseInt(masaField.getText());
            int wzrost = Integer.parseInt(wzrostField.getText());


            CalculatorBMI kalkulator = new CalculatorBMI(masa, wzrost);


            double bmi = kalkulator.obliczBMI();
            String ocena = kalkulator.ocenaBMI();


            wynikBMI.setText(String.format("%.2f", bmi));//formatowanie do 2 miejsc po przecinku
            ocenaBMI.setText(ocena);

        } catch (Exception e) {
            wynikBMI.setText("Błąd");
            ocenaBMI.setText("Sprawdź dane");
        }
    }
}