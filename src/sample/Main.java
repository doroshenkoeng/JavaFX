package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**This class provides methods for GUI launching.*/
public class Main extends Application {

    @Override
    /**Creating GUI.*/
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("CardGame");
        Scene scene=new Scene(root, 1024, 768);
        primaryStage.getIcons().add(new Image("pictures/GameIcon3.png"));
        scene.getStylesheets().add(Main.class.getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**Launching GUI.*/
    public static void main(String[] args) {
        launch(args);
    }
}
