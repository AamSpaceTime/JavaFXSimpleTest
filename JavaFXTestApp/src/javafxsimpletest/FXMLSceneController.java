/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsimpletest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Андрей
 */
public class FXMLSceneController implements Initializable {

    @FXML
    private Label Test;
    @FXML
    private Button ClickMe;    
    @FXML
    private void handleButtonClick(ActionEvent event) {
        System.out.println("Hallo Java");
        Test.setText("Hallo Java");
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    
}
