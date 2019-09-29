package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class LayoutController {
	
    @FXML TextField textFieldNom ;
    @FXML ListView<String> listview1;
    @FXML Button button1;
    
    public void addFruit() {
    	button1.getStyleClass().add("myButton");
    	String nom = textFieldNom.getText();
    	listview1.getItems().add(nom);
    }
}
