package com.example.marketcodereader;

import com.example.marketcodereader.models.Client;
import com.example.marketcodereader.models.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ClientScreenController implements Initializable {
    @FXML
    private TextField edtClientName;
    @FXML
    private TextField edtCPF;
    @FXML
    private Button btnPrint;

    public void btnPrintOnAction(ActionEvent event) throws IOException {
        Data.client = new Client(edtClientName.getText(), edtCPF.getText(), Data.cart);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("note_screen.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Nota Impressa");
        stage.setScene(scene);
        stage.show();
    }

    public void printBtnSetVisibility(){
        btnPrint.setVisible((edtClientName.getText().length() > 0 && (edtCPF.getText().length() == 11 || edtCPF.getText().length() == 14)) || (edtCPF.getText().equals("95741281000140") && edtClientName.getText().equals("DCOMPMarket")));
    }

    public void edtCPFOnTextChange(KeyEvent inputMethodEvent) {
        printBtnSetVisibility();
    }

    public void edtClientNameOnTextChange(KeyEvent inputMethodEvent) {
        printBtnSetVisibility();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        printBtnSetVisibility();
    }
}
