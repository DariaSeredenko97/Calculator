package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Label label;
    @FXML
    private TextField txtDisplay_tf;
    private boolean decimalClick = false; // для кнопки "."


    private void handleButton_action(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handlerGeneral_action(ActionEvent event) {

    }

    @FXML
    private void handlerDigit_action(ActionEvent event) {
        String digitObj = ((Button) event.getSource()).getText();
        String oldText = txtDisplay_tf.getText();
        String newText = oldText + digitObj;
        txtDisplay_tf.setText(newText);
    }

    @FXML
    private void handlerEqual_action(ActionEvent event) {

    }

    @FXML
    private void handlerDecimal_action(ActionEvent event) {
        if(decimalClick == false){
            String decimalObj = ((Button) event.getSource()).getText();
            String oldText = txtDisplay_tf.getText();
            String newText = oldText + decimalObj;
            txtDisplay_tf.setText(newText);
            decimalClick = true;

        }
    }
}
