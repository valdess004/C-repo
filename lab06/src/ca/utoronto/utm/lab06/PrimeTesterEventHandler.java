package ca.utoronto.utm.lab06;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimeTesterEventHandler implements EventHandler<ActionEvent>{
	
	private TextField outputF = new TextField();
	private TextField inputF = new TextField();
	public PrimeTesterEventHandler(TextField tf1 , TextField tf2) {
		this.inputF = tf1;
		this.outputF = tf2;	
	}

	// 1) Modify this so that it prints out which button was pressed.
	// Hint: Lookup ActionEvent
	// 2) Modify this so that it sets the text field to which button was pressed
	// Hint: this event handler will need access to a the text field

	public void handle(ActionEvent event) {		
		try {
			int n=Integer.parseInt(this.inputF.getText());
			if (isPrime(n)) {
				outputF.setText("Yes");
			}
			else {
				outputF.setText("No");
			}
				
		} catch(NumberFormatException nfe){
			outputF.setText("invalid number");
		}
		return;
	}
	private boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i == 0) return false;
		}
		return true;
	}
}


