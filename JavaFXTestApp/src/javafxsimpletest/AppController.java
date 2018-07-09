/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsimpletest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Андрей
 */
public class AppController implements Initializable {

    @FXML
    private Label Test;
    @FXML
    private Button ClickMe;    
    @FXML
    private void handleButtonClick(ActionEvent event) {
        System.out.println("Hallo Java");
        Test.setText("Hallo Java");
    }
    
    
    public static EventHandler<KeyEvent> eventHandlerTest = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("Test -> " + event.getCode());
            }
        };
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    
}
