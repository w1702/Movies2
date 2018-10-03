package controller;
import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import model.*;

// needs a type
public class ShowAllCustomersController extends Controller<Kiosk>{
    
    
    public final Kiosk getKiosk(){
        return model;
    }
    
    @FXML private void handleExit(ActionEvent event) throws Exception{
        stage.close();
    }
}
