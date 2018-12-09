package budgeter;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

import javafx.scene.control.*;
import javafx.event.*;

public class MainMenu  extends Application{
    void run() {
        launch();
    }

    public void start(Stage myStage) {
        myStage.setTitle("Main Menu");

        BorderPane rootNode = new BorderPane();

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

                System.out.println("You clicked on the menu item: " + name);
            }
        };

        open.setOnAction(MEHandler);

        rootNode.setTop(mb);

        myStage.show();
    }
}