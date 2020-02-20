package ca.utoronto.utm.lab06;

import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.application.Application;

public class PrimeTester2 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		VBox pane = new VBox(5);
		pane.setPadding(new Insets(5));
		pane.getChildren().add(new PrimeTesterPanel());
		
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.setTitle("Prime Tester 2");
		stage.show();
		
	}
}
