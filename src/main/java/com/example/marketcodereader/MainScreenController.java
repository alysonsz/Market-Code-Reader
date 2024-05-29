package com.example.marketcodereader;

import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Data;
import com.example.marketcodereader.models.Product;
import com.example.marketcodereader.services.DBconnection;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {
    @FXML
    private Button btnPop;
    @FXML
    private TextField edtBarCode;
    @FXML
    private Label txtTotal;
    @FXML
    private TableView<Product> tableView;
    @FXML
    private TableColumn<Product, Long> tbColumnCode;
    @FXML
    private TableColumn<Product, String> tbColumnName;
    @FXML
    private TableColumn<Product, String> tbColumnPrice;
    @FXML
    private Label txtProductNotExists;

    private final DBconnection db = new DBconnection();
    private final Cart cart = new Cart();
    private Product selectedItem;


    public void btnAddOnAction() {
        this.db.connect();
        Product product = this.db.getProduct(Long.valueOf(edtBarCode.getText()));
        if(product != null){
            this.cart.addProduct(product);
            updateListView();
            txtProductNotExists.setVisible(false);
        }else {
            txtProductNotExists.setVisible(true);
        }
        this.db.close();
    }


    private void updateListView() {
        tbColumnCode.setCellValueFactory(new PropertyValueFactory<>("code"));
        tbColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tbColumnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        tableView.getItems().clear();

        for (Product product : cart.getProductList()){
            tableView.getItems().add(product);
        }
        txtTotal.setText(this.cart.getTotalItemsValue());

        tableView.setOnMouseClicked(mouseEvent -> {
            ObservableList<Product> items = tableView.getSelectionModel().getSelectedItems();
            if (items.size() > 0){
                selectedItem = items.get(0);
                btnPop.setVisible(true);
            }

        });
    }

    public void btnPopOnAction() {
        if (selectedItem!= null){
            tableView.getItems().remove(selectedItem);
            cart.removeProduct(selectedItem);
            updateListView();
            btnPop.setVisible(false);
        }
    }

    public void btnPrintNoteOnAction(ActionEvent event) throws IOException {
        Data.cart = cart;
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("client_screen.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Dados do Cliente");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cart.clearCart();
        updateListView();
    }
}