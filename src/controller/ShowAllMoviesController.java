package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.*;

// needs a type
public class ShowAllMoviesController extends Controller<Catalogue> {
    
    public final Catalogue getCatalogue(){
        return model;
    }
    
    @FXML private void handleExit(ActionEvent event) throws Exception{
        stage.close();
    }
}
