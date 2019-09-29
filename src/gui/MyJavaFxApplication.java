package gui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyJavaFxApplication extends Application{

	public static void main(String[] args) {
		launch(args); // appel la méthode start

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Fruits");
		BorderPane borderPaneRoot = new BorderPane();
		Scene scene = new Scene(borderPaneRoot,800,600);
		primaryStage.setScene(scene);
		
		HBox hbox1 = new HBox();
		hbox1.setPadding(new Insets(10));
		hbox1.setSpacing(10);
		Label labelNom = new Label("Fruit:");
		labelNom.setPadding(new Insets(5));
		TextField textFieldNom = new TextField();
		Button button1 = new Button("Ajouter");
		hbox1.getChildren().addAll(labelNom,textFieldNom,button1);
		
		VBox vbox1 = new VBox();
		vbox1.setPadding(new Insets(10));
		
		ObservableList<String> ObservableList = FXCollections.observableArrayList();
		ListView<String> listView1 = new ListView<String>(ObservableList);
		//listView1.getItems().addAll("Orange","Pomme");
		ObservableList.addAll("A","B");
		vbox1.getChildren().add(listView1);
		
		borderPaneRoot.setTop(hbox1);
		borderPaneRoot.setCenter(vbox1);
		
		button1.setOnAction(e -> {
			String nom = textFieldNom.getText();
			//listView1.getItems().add(nom);
			ObservableList.add(nom);
		});
		primaryStage.show();
	}

}
