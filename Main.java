package OlkaGCD;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("НОД для Ольки");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 350, 75);
        primaryStage.setScene(scene);

        final Text scenetitle = new Text("Вводи цифры.");
        grid.add(scenetitle, 0, 0, 1, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 0, 1);

        userTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            String checkForValidity = Parser.validator(newValue);
            if (checkForValidity == null) {
                scenetitle.setText(GCD.getGcd(Parser.getInputValues(newValue)));
            } else {
                scenetitle.setText(checkForValidity);
            }
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
