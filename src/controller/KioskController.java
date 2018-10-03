package controller;
import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.Kiosk;

public class KioskController extends Controller<Kiosk> {

    @FXML
    public void initialize() {
      
    }
  
    public final Kiosk getKiosk() {
        return model;
    }
  
    // CHECK PARAMETERS
    @FXML private void handleAdmin(ActionEvent event) throws Exception{
      ViewLoader.showStage(getKiosk(), "/view/Admin.fxml", "Administration Menu", new Stage());
    }
    @FXML private void handleCatalogue(ActionEvent event) throws Exception{
      ViewLoader.showStage(getKiosk().getCatalogue(), "/view/Catalogue.fxml", "Catalogue", new Stage());
    }
     @FXML private void handleCustomerRecord(ActionEvent event) throws Exception{
      ViewLoader.showStage(getKiosk(), "/view/CustomerRecord.fxml", "Patron Record", new Stage());
    }
     @FXML private void handleTopUp(ActionEvent event) throws Exception{
      ViewLoader.showStage(getKiosk(), "/view/TopUpAccount.fxml", "Account Top-up", new Stage());
    }
     @FXML private void handleFavourites(ActionEvent event) throws Exception{
      ViewLoader.showStage(getKiosk().getCatalogue(), "/view/FavouriteMovies.fxml", "Favourites", new Stage());
    }
    @FXML private void handleQuit(ActionEvent event) throws Exception{
      stage.close();
    }

}
