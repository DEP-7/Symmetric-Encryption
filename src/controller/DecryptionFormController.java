package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class DecryptionFormController {
    public JFXTextField txtCipherText;
    public JFXTextField txtKey;
    public JFXTextField txtOutput;

    public void btnDecryption_OnAction(ActionEvent actionEvent) {
        String text = txtCipherText.getText();
        String key = txtKey.getText();
        if (key.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }
        //System.out.println(text.substring(text.length() - key.length(), text.length()).equals(key));
        //if (text.substring(text.length() - key.length(), text.length()).equals(key)) {
        //    txtOutput.setText(getDecryptedValue(text));
        //}
        String output=getDecryptedValue(text);
        if (output.substring(output.length() - key.length(), output.length()).equals(key)){
            txtOutput.setText(output.substring(0,output.length()-1));
        }
    }

    private String getDecryptedValue(String text) {
        //text = text.substring(0, text.length() - 1);
        //text = text.substring(0, 1) + text.substring(1);
        String output = "";
        for (int i = 0; i < text.length(); i+=3) {
            //System.out.println(Character.toString((char)Integer.parseInt(text.substring(i,i+3))));
            output += Character.toString((char)Integer.parseInt(text.substring(i,i+3)));
        }
        output = output.substring(output.length()-1) + output.substring(0,output.length()-1);
        return output;
    }
}
