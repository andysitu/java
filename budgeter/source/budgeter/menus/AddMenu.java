package budgeter.menus;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.util.*;
import java.util.function.UnaryOperator;
import javafx.util.converter.DoubleStringConverter;
import javafx.scene.layout.*;

import javafx.scene.control.*;
import javafx.event.*;

import javafx.geometry.Pos;

class AddMenu {
    static boolean clicked = false;

    public static boolean display() {
        Stage submenu = new Stage();
        submenu.initModality(Modality.APPLICATION_MODAL);
        submenu.setTitle("Add Menu");

        Label label1 = new Label("Amount:");

        TextField tf = new TextField();

        StringConverter<Double> converter = new DoubleStringConverter();

        UnaryOperator<TextFormatter.Change> integerFilter = change -> {
            String input = change.getText();
            if (input.matches("[0-9]*")) { 
                return change;
            }
            return null;
        };
        
        
        TextFormatter<Double> tf1 = new TextFormatter<>(converter, 0d, integerFilter);

        tf.setTextFormatter(tf1);

        Button clickMeButton = new Button("Submit");

        clickMeButton.setOnAction( ae -> {
            System.out.println(tf.getText());
            submenu.close();
        });

        FlowPane layout = new FlowPane(10, 10);

        layout.getChildren().addAll(label1, tf, clickMeButton);

        layout.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(layout, 300, 500);

        submenu.setScene(scene1);

        submenu.showAndWait();

        return clicked;
    }
}