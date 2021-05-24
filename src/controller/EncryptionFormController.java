package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class EncryptionFormController {
    public JFXTextField txtText;
    public JFXTextField txtKey;
    public JFXTextField txtOutput;

    /*public void btnEncryption_OnAction(ActionEvent actionEvent) {
        String text = txtText.getText();
        String key = txtKey.getText();
        if (key.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }
        text += key;
        String reversedText = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        String cipherText = "";
        for (int i = 0; i <reversedText.length(); i++) {
            int code=reversedText.charAt(i);
            code+=10;
            char newChar=(char)code;
            cipherText+=newChar;
        }
        txtOutput.setText(cipherText);
    }*/


    public void btnEncryption_OnAction(ActionEvent actionEvent) {
        String text = txtText.getText();
        String key = txtKey.getText();
        txtOutput.setText(getEncryptedValue(text, key));
    }

    private String getEncryptedValue(String text, String key) {
        text = text.substring(1) +key+ text.substring(0, 1);
        String output="";
        for (int i = 0; i < text.length(); i++) {
            System.out.println(String.format("%03d",(int)text.charAt(i)));
            output+=String.format("%03d",(int)text.charAt(i));
        }
        return output;
    }
}
