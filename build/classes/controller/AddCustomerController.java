package controller;
import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;

public class AddCustomerController extends Controller<Kiosk>{
     @FXML private TextField idTf;
     @FXML private TextField nameTf;
     @FXML private TextField balanceTf;
     @FXML private Text statusTxt;
     
    public final Kiosk getKiosk(){
        return model;
    }
    private int getID(){
        return Integer.parseInt(idTf.getText());
    }
    private void setID(){
        idTf.setText("");
    }
    private String getName(){
        return nameTf.getText();
    }
    private void setName(){
        nameTf.setText("");
    }
    private int getBalance(){
        return Integer.parseInt(balanceTf.getText());
    }
    private void setBalance(){
        balanceTf.setText("");
    }
    private void setStatus(String text){
        statusTxt.setText(text);
    }
    
//    private boolean isInt(int number){
//        return "0123456789".contains("" + number);
//    }
    
    @FXML private void handleAddCustomer(ActionEvent event) throws Exception{  
        
         try{
            getKiosk().addCustomer(getID(), getName(), getBalance());
            setStatus("Customer added to Kiosk.");
         }
         catch(Exception e){
            setStatus("Customer could not be added. ID and Balance must be integers.");
         }
         finally{
             setID();
             setName();
             setBalance();
         }
               
               
           
    }
    
    @FXML private void handleClose(ActionEvent event) throws Exception{
        stage.close();
    }
}
