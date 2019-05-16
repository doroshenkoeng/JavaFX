package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    private Label actionTarget;
    @FXML
    protected void handleSubmitButtonAction(ActionEvent actionEvent) {
        actionEvent.setText("");
    }
}
