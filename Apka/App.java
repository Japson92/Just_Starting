package Apka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Template.fxml"));
        Parent layout = fxmlLoader.load();

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public enum OperatorModes {
        add, minus, multiply, divide
    }

    private Double num1;
    private Double num2;
    private OperatorModes mode = OperatorModes.add;

    private Double calculate() {
        if (mode == OperatorModes.add) {
            return num1 + num2;
        }
        if (mode == OperatorModes.minus) {
            return num1 - num2;
        }
        if (mode == OperatorModes.multiply) {
            return num1 * num2;
        }
        if (mode == OperatorModes.divide) {
            return num1 / num2;
        }

        return null;
    }
}