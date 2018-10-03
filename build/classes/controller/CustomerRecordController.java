package controller;
import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Kiosk;

// needs a type
public class CustomerRecordController extends Controller<Kiosk>{
    @FXML private TextField idTf;
    @FXML private TableView rentedTv;
    @FXML private TableView historyTv;
    @FXML private Text statusTxt;
    @FXML private Button selectCustomerBtn;
    
    @FXML private void initialize(){
        idTf.textProperty().addListener(
                (observable, oldText, newText) -> selectCustomerBtn.setDisable(newText == null)
        );
    }
    
    public final Kiosk getKiosk(){
        return model;
    }
    private int getID(){
         return Integer.parseInt(idTf.getText());
    }
    private void setID(){
        idTf.setText("");
    }
    
    @FXML private void handleSelect(ActionEvent event) throws Exception{
        
        try{
            historyTv.setItems(getKiosk().getCustomer(getID()).rentingHistory());
            rentedTv.setItems(getKiosk().getCustomer(getID()).currentlyRented());
            statusTxt.setText(getKiosk().getCustomer(getID()).toString());
            
        }
        catch(Exception e){
            statusTxt.setText("Customer could not be found.");  
        }
    }
    @FXML private void handleClose(ActionEvent event) throws Exception{
        stage.close();
    }
}
