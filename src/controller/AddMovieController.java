package controller;
import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;

// need a type
public class AddMovieController extends Controller<Catalogue>{
    @FXML private TextField titleTf;
    @FXML private TextField yearTf;
    @FXML private TextField genreTf;
    @FXML private TextField priceTf;
    @FXML private Text statusTxt;
    
    public final Catalogue getCatalogue(){
        return model;
    }
    private String getTitle(){
        return titleTf.getText();
    }
    private void setTitle(){
        titleTf.setText("");
    }
    private int getYear(){
        return Integer.parseInt(yearTf.getText());
    }
    private void setYear(){
        yearTf.setText("");
    }
    private String getGenre(){
        return genreTf.getText();
    }
    private void setGenre(){
        genreTf.setText("");
    }
    private int getPrice(){
        return Integer.parseInt(priceTf.getText());
    }
    private void setPrice(){
        priceTf.setText("");
    }
    private void setStatus(String text){
        statusTxt.setText(text);
    }
    
    @FXML private void handleAddMovie(ActionEvent event) throws Exception{
        
        
        try{
           getCatalogue().addMovie(getTitle(), getYear(), getGenre(), getPrice());
           setStatus("Movie added to Catalogue.");
        }
        catch(Exception e){
            setStatus("Movie could not be added. Year and Price must be integers.");
        }
        finally{
            setTitle();
            setYear();
            setGenre();
            setPrice();
        }
    }
    
    @FXML private void handleClose(ActionEvent event) throws Exception{
        stage.close();
    }
}
