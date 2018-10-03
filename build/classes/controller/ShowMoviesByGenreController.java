package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import model.Catalogue;
import model.Genre;
import model.Movie;


public class ShowMoviesByGenreController extends Controller<Catalogue>{
    @FXML private ListView<Genre> genresLv;
    @FXML private TableView<Movie> moviesTv;
    
    public final Catalogue getCatalogue(){
        return model;
    }
    private Genre getGenre(){
        return genresLv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleDisplay(ActionEvent event) throws Exception{
        moviesTv.setItems(getCatalogue().getMoviesInGenre(getGenre()));
    }
    @FXML private void handleExit(ActionEvent event) throws Exception{
        stage.close();
    }
}
