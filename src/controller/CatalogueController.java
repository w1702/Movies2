
package controller;
import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.*;

// Controller needs a type
public class CatalogueController extends Controller<Catalogue> {
    
    public final Catalogue getCatalogue() {
        return model;
    }
     
    @FXML private void handleAllMovies(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(), "/view/ShowAllMovies.fxml", "All Movies", new Stage());
    }
    @FXML private void handleAvailableMovies(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(), "/view/ShowAvailableMovies.fxml", "Available Movies", new Stage());
    }
    @FXML private void handleMoviesByGenre(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(), "/view/ShowMoviesByGenre.fxml", "Movies By Genre", new Stage());
    }
    @FXML private void handleMoviesByYear(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(), "/view/ShowMoviesByYear.fxml", "Movies By Year", new Stage());
    }
    @FXML private void handleRentMovie(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(), "/view/RentMovie.fxml", "Rent a Movie", new Stage());
    }
    @FXML private void handleReturnMovie(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(), "/view/ReturnMovie.fxml", "Return a Movie", new Stage());
    }
    @FXML private void handleExit(ActionEvent event) throws Exception{
      stage.close();
    }
}
