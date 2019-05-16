package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**This class provides methods for events handling*/
public class Controller {
    @FXML
    /**A label field used for showing game result/*/
    private Label gameResultLabel = new Label();
    @FXML
    /**A text field used for getting data from the text field.*/
    private TextField cardsNumberField = new TextField();

    @FXML
    /**A method used for events handling*/
    protected void handleSubmitButtonAction(ActionEvent actionEvent) {
        Player player1 = new Player();
        Player player2 = new Player();
        try {
            player1.setmCardsNumber(Integer.parseInt(cardsNumberField.getText()));
        } catch (Exception e) {
            player1.setmCardsNumber(36);
        }
        CardGame game = new CardGame(player1, player2);
        game.startGame();
        int result = game.getResult();
        if (result == 1) {
            gameResultLabel.setText("First player won!");

        } else if (result == 2) {
            gameResultLabel.setText("Second player won!");

        } else {
            gameResultLabel.setText("Nobody won");
        }
    }

}
