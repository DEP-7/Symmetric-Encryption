package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;

    public void btnEncryption_OnAction(ActionEvent actionEvent) throws IOException {
        Stage newStage=new Stage();
        Parent root= FXMLLoader.load(this.getClass().getResource("../view/EncryptionForm.fxml"));
        Scene scene=new Scene(root);
        newStage.setScene(scene);
        newStage.setTitle("Encryption Window");
        newStage.centerOnScreen();
        newStage.initOwner(this.root.getScene().getWindow());
        newStage.initModality(Modality.WINDOW_MODAL);
        newStage.show();
    }

    public void btnDecryption_OnAction(ActionEvent actionEvent) throws IOException {
        Stage newStage=new Stage();
        Parent root= FXMLLoader.load(this.getClass().getResource("../view/DecryptionForm.fxml"));
        Scene tableScene=new Scene(root);
        newStage.setScene(tableScene);
        newStage.setTitle("Deryption Window");
        newStage.centerOnScreen();
        newStage.initOwner(this.root.getScene().getWindow());
        newStage.initModality(Modality.WINDOW_MODAL);
        newStage.show();
    }
}
