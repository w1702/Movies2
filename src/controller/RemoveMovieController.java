package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import model.Catalogue;
import model.Customer;
import model.Movie;

// needs a type
public class RemoveMovieController extends Controller<Catalogue>{
    
    @FXML private TableView<Movie> moviesTv;
    
    public final Catalogue getCatalogue(){
        return model;
    }
    private Movie getMovie(){
        return moviesTv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleRemove(ActionEvent event) throws Exception{
        getCatalogue().removeMovie(getMovie());
    }
    @FXML private void handleExit(ActionEvent event) throws Exception{
        stage.close();
    }
}
