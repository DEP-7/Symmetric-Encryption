package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;

public class DecryptionFormController {
    public JFXTextField txtCipherText;
    public JFXTextField txtKey;
    public JFXTextField txtOutput;

    public void btnDecryption_OnAction(ActionEvent actionEvent) {
        String text = txtCipherText.getText();
        String key = txtKey.getText();
        System.out.println(text.substring(text.length() - key.length(), text.length()).equals(key));
        if (text.substring(text.length() - key.length(), text.length()).equals(key)) {
            txtOutput.setText(getDecryptedValue(text));
        }
    }

    private String getDecryptedValue(String text) {
        text = text.substring(0, text.length() - 1);
        //text = text.substring(0, 1) + text.substring(1);
        String output = "";
        for (int i = 0; i < text.length(); i+=3) {
            //System.out.println(Character.toString((char)Integer.parseInt(text.substring(i,i+3))));
            output += Character.toString((char)Integer.parseInt(text.substring(i,i+3)));
        }
        output = output.substring(0, 1) + output.substring(1);
        return output;
    }
}
