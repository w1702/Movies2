package controller;
import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Kiosk;

// needs a type
public class TopUpAccountController extends Controller<Kiosk>{
    @FXML private TextField idTf;
    @FXML private TextField amountTf;
    @FXML private Text statusTxt;
    @FXML private Button topUpBtn;
    
    @FXML private void initialize(){
        idTf.textProperty().addListener(
                (observable, oldText, newText) -> topUpBtn.setDisable(newText == null)
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
    private int getAmount(){
        return Integer.parseInt(amountTf.getText());
    }
    private void setAmount(){
        amountTf.setText("");
    }
    private void setStatus(String text){
        statusTxt.setText(text);
    }
    
    @FXML private void handleTopUp(ActionEvent event) throws Exception{
         
         
        try{
            getKiosk().getCustomer(getID()).topUpAccount(getAmount()); 
            setStatus("Transaction Complete.");
        }
        catch(Exception e){
            setStatus("Transaction could not be completed. ID may be incorrect, ID and Top Up Amount must be integers.");
        }
        finally{
            setID();
            setAmount();
        }
    }
    
    @FXML private void handleClose(ActionEvent event) throws Exception{
        stage.close();
    }
}
