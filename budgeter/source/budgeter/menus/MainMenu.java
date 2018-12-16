package budgeter.menus;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

import javafx.scene.control.*;
import javafx.event.*;

import javafx.geometry.Pos;

import budgeter.MenuController;

public class MainMenu  extends Application{

    static boolean result;
    public void run() {
        launch();
    }

    public void start(Stage myStage) {
        myStage.setTitle("Main Menu");

        VBox rootNode = new VBox();

        Scene myScene = new Scene(rootNode, 800, 400);

        myStage.setScene(myScene);

        MenuBar mb = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem open = new MenuItem("Open");
        fileMenu.getItems().addAll(open);

        mb.getMenus().add(fileMenu);

        EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                String name = ((MenuItem) ae.getTarget()).getText();

                MenuController.test();

                System.out.println("You clicked on the menu item: " + name);
        
            }
        };

        open.setOnAction(MEHandler);

        // rootNode.setTop(mb);

        Button addBtn = new Button("+");
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                result = AddMenu.display();
                
                System.out.println("The result is " + result);
            }
        });

        rootNode.getChildren().addAll(mb, addBtn);

        myStage.show();
    }
}