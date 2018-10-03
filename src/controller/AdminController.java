package controller;
import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.*;

public class AdminController extends Controller<Kiosk>{
    
    public void initialize(){
        
    }
    
    public final Kiosk getKiosk() {
        return model;
    }
    
    @FXML private void handleViewCustomers(ActionEvent event) throws Exception{
        ViewLoader.showStage(getKiosk(), "/view/ShowAllCustomers.fxml", "Show All Customers", new Stage());
    }
    @FXML private void handleViewMovies(ActionEvent event) throws Exception{
        ViewLoader.showStage(getKiosk().getCatalogue(), "/view/ShowAllMovies.fxml", "Show All Movies", new Stage());
    }
    @FXML private void handleAddCustomer(ActionEvent event) throws Exception{
        ViewLoader.showStage(getKiosk(), "/view/AddCustomer.fxml", "Add Customer", new Stage());
    }
    @FXML private void handleAddMovie(ActionEvent event) throws Exception{
        ViewLoader.showStage(getKiosk().getCatalogue(), "/view/AddMovie.fxml", "Add Movie", new Stage());
    }
    @FXML private void handleRemoveCustomer(ActionEvent event) throws Exception{
        ViewLoader.showStage(getKiosk(), "/view/RemoveCustomer.fxml", "Remove Customer", new Stage());
    }
    @FXML private void handleRemoveMovie(ActionEvent event) throws Exception{
        ViewLoader.showStage(getKiosk().getCatalogue(), "/view/RemoveMovie.fxml", "Remove Movie", new Stage());
    }
    @FXML private void handleExit(ActionEvent event) throws Exception{
        stage.close();
    }
}
