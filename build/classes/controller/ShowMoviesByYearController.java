package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import model.Catalogue;
import model.Movie;

public class ShowMoviesByYearController extends Controller<Catalogue>{
    // is <Integer> correct? 
    @FXML private ListView<Integer> yearsLv;
    @FXML private TableView<Movie> moviesTv;
    
    public final Catalogue getCatalogue(){
        return model;
    }
    private int getYear(){
        return yearsLv.getSelectionModel().getSelectedItem();   
    }
    
    @FXML private void handleDisplay(ActionEvent event) throws Exception{
        
        moviesTv.setItems(getCatalogue().getMoviesByYear(getYear())); 
    }
    @FXML private void handleExit(ActionEvent event) throws Exception{
        stage.close();
    }
}
