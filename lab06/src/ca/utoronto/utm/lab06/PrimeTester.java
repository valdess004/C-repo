package ca.utoronto.utm.lab06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;

public class PrimeTester extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		// Create a layout pane that contains the elements
		HBox pane = new HBox(3);
		pane.setPadding(new Insets(10));

		// Create the buttons
		TextField input = new TextField();
		input.setPrefColumnCount(10);
		
		TextField output = new TextField();
		output.setPrefColumnCount(10);
		output.setEditable(false);
		
		Button isP_btn = new Button("Is Prime?");


		// Put the buttons on the pane
		pane.getChildren().add(input);
		pane.getChildren().add(isP_btn);
		pane.getChildren().add(output);	

		// Hook up the event handler that defines 
		// what to do when the button is clicked.
		// See HiByeEventHandler.java
		isP_btn.setOnAction(new PrimeTesterEventHandler(input, output));

		// Use pane as the root of the scene
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		
		// Set the title of the window
		stage.setTitle("Prime Tester JavaFX");
		
		// Show the window
		stage.show();	
	}
}


