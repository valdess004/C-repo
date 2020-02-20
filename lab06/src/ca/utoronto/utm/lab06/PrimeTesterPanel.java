package ca.utoronto.utm.lab06;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;


public class PrimeTesterPanel extends FlowPane implements EventHandler <ActionEvent> {
	
	TextField input = new TextField();
	TextField output = new TextField();
	
	public PrimeTesterPanel() {

		Button b;
		
		input.setPrefColumnCount(10);
		this.getChildren().add(input);
		
		b = new Button("Is Prime?");
		this.getChildren().add(b);
		b.setOnAction(this);
		
		output.setPrefColumnCount(10);
		output.setEditable(false);
		this.getChildren().add(output);
			
	}
	
	private boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i == 0) return false;
		}
		return true;
	}

	public void handle(ActionEvent event) {
		try {
			int n=Integer.parseInt(this.input.getText());
			if (isPrime(n)) {
				output.setText("Yes");
			}
			else {
				output.setText("No");
			}
				
		} catch(NumberFormatException nfe){
			output.setText("invalid number");
		}
		return;
	}

}
