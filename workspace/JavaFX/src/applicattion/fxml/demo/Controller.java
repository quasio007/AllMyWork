package applicattion.fxml.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
@FXML
private TextArea area;

@FXML
private TextField field1;

@FXML
private TextField field2;

@FXML
private Button button1;

@FXML
	public void add(ActionEvent e){
		Integer num1 =Integer.parseInt(field1.getText());
		Integer num2 =Integer.parseInt(field2.getText());
		int sum =num1+num2;
		area.setText("Sum of two numbers is: "+Integer.toString(sum));
	}
}
