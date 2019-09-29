package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyJavaFXML extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPaneRoot = FXMLLoader.load(getClass().getResource("Layout.fxml"));
		Scene scene = new Scene(borderPaneRoot, 600,400);
		scene.getStylesheets().add(getClass().getResource("myStyle.css").toString());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
