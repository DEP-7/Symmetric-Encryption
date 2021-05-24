package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;

public class EncryptionFormController {
    public JFXTextField txtText;
    public JFXTextField txtKey;
    public JFXTextField txtOutput;

    public void btnEncryption_OnAction(ActionEvent actionEvent) {
        String text = txtText.getText();
        String key = txtKey.getText();
        txtOutput.setText(getEncryptedValue(text, key));
    }

    private String getEncryptedValue(String text, String key) {
        text = text.substring(1) + text.substring(0, 1);
        String output="";
        for (int i = 0; i < text.length(); i++) {
            //System.out.println(String.format("%03d",(int)text.charAt(i)));
            output+=String.format("%03d",(int)text.charAt(i));
        }
        return output+key;
    }
}
