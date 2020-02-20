package ca.utoronto.utm.lab06;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HiByeEventHandler implements EventHandler<ActionEvent> {
	
	private TextField outputF = new TextField();
	public HiByeEventHandler(TextField tf) {
		super();
		this.outputF = tf;
	}

	// 1) Modify this so that it prints out which button was pressed.
	// Hint: Lookup ActionEvent
	// 2) Modify this so that it sets the text field to which button was pressed
	// Hint: this event handler will need access to a the text field

	public void handle(ActionEvent event) {

		Button src = (Button) event.getSource();
		System.out.println(src.getText() + " button pressed");
		outputF.setText(src.getText());
		return;
	}
}
