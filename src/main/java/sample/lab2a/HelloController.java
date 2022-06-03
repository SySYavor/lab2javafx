package sample.lab2a;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button btnMain;
    int clickCounter = 0;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Klikniecie nr: "+ ++clickCounter);
        if (clickCounter == 1)
            btnMain.setText("I jeszcze raz");
    }
}