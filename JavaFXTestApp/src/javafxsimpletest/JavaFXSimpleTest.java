/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsimpletest;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Андрей
 */
public class JavaFXSimpleTest extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLScene.fxml"));
        
        /*
        Button btn = new Button();
        btn.setText("Say 'Hello World'");       
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        */

        Scene scene = new Scene(root);
              
        
        EventHandler<KeyEvent> eventHandlerTextField;
        eventHandlerTextField = (KeyEvent event) -> {
            System.out.println("Field -> " + event.getCode());
            /*
            switch (event.getKeyCode()) {
            case ESCAPE:
            System.out.println("Escape!");
            //stage.hide();
            event.consume();
            break;
            default:
            break;
            }
            */
        };
        
        
        //scene.addEventHandler(KeyEvent.ANY, eventHandlerTextField);
        //scene.addEventHandler(KeyEvent.KEY_PRESSED, eventHandlerTest);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, AppController.eventHandlerTest);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
