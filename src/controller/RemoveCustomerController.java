package controller;
import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import model.Customer;
import model.Kiosk;

// needs type
public class RemoveCustomerController extends Controller<Kiosk>{
    
    @FXML private TableView<Customer> customersTv;
 
    public final Kiosk getKiosk(){
        return model;
    } 
    private Customer getCustomer(){
        return customersTv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleRemove(ActionEvent event) throws Exception{
        getKiosk().removeCustomer(getCustomer());
    }
    @FXML private void handleExit(ActionEvent event) throws Exception{
        stage.close();
    }
}
