
package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Catalogue;
import model.Movie;

public class ReturnMovieController extends Controller<Catalogue>{
    @FXML private TextField idTf;
    @FXML private TableView moviesTv;
    @FXML private Text statusTxt;
    @FXML private Button returnBtn;
    @FXML private Button selectCustomerBtn;
    
    @FXML private void initialize(){
        moviesTv.getSelectionModel().selectedItemProperty().addListener(
           (observable, oldMovie, newMovie) -> returnBtn.setDisable(newMovie == null)
        );
        idTf.textProperty().addListener(
            (observable, oldText, newText) -> selectCustomerBtn.setDisable(newText == null)
        );
    }
    
    public final Catalogue getCatalogue(){
        return model;
    }
    private int getID(){
        return Integer.parseInt(idTf.getText());
    }
    private void setID(){
        idTf.setText("");
    }
    
    @FXML private void handleSelectCustomer(ActionEvent event) throws Exception{
        moviesTv.setItems(getCatalogue().getCustomer(getID()).currentlyRented());
    }
    @FXML private void handleReturn(ActionEvent event) throws Exception{
        getCatalogue().returnMovieFromCustomer((Movie) moviesTv.getSelectionModel().getSelectedItem(), getCatalogue().getCustomer(getID()));
        statusTxt.setText("Movie Returned.");
    }
    @FXML private void handleClose(ActionEvent event) throws Exception{
        stage.close();
    }
}
