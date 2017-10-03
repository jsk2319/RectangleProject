/**
 *@author jsk2319@email.vccs.edu
 * Author: Jude Kallista-Fitzpatrick
 * Purpose: To present the user with the area and perimeter of their input
 */


import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Rectangle extends Application {
    @Override
    public void start(Stage primaryStage) {

        TextInputDialog sizeInput = new TextInputDialog();
        sizeInput.setHeaderText("Type the width and height of the rectangle and separate them by a space.");
        Optional<String> input = sizeInput.showAndWait();
        String[] side = input.get().split(" ");

        double width = Double.parseDouble(side[0]);
        double height = Double.parseDouble(side[1]);
        double perimeter = 2*width + height;
        double area = width * height;

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setContentText("The perimeter of the rectangle is " + perimeter + "\nThe area of the rectangle is " + area);
        alert.showAndWait();
    }
}
