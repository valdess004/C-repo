import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.fxml.FXMLLoader;
//import java.awt.event.ActionEvent;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class CreationController extends DataController{

    //public UserAccess userManager = new UserAccess();

    @FXML
    private Button btnExit;

    @FXML
    private Button btnCreate;

    @FXML
    private ToggleGroup userType;

    @FXML
    private RadioButton radioApp;

    @FXML
    private RadioButton radioHR;

    @FXML
    private RadioButton radioInt;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPass;

    @FXML
    public void exit(ActionEvent event) throws  Exception{

        Parent creation = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
        Scene tableViewScene = new Scene(creation);

        // Instead of retrieving the stage by the event's source, you can do it by one of your FXML component.
        Stage window = (Stage) btnExit.getScene().getWindow();
        window.close();
        window.setScene(tableViewScene);
        window.show();

        //((Stage) btnExit.getScene().getWindow()).close();
        //Stage stage = (Stage) exit.getScene().getWindow();
        // do what you have to do
        //stage.close();
    }

    @FXML
    public void create(ActionEvent event) throws IOException{
        //UserAccess userManager = new UserAccess();
        if (userType.getSelectedToggle() == radioApp) {
            Applicant tempApp = new Applicant(txtUsername.getText(), txtPass.getText());
            this.checkLogin(tempApp);
        } else if (userType.getSelectedToggle() == radioHR) {
            HR tempHR = new HR(txtUsername.getText(), txtPass.getText());
            this.checkLogin(tempHR);
        } else if (userType.getSelectedToggle() == radioInt) {
            Interviewer tempInt = new Interviewer(txtUsername.getText(), txtPass.getText());
            this.checkLogin(tempInt);
        //}else {
            //alert.showAndWait();
        }
    }

    public void checkLogin(User user) throws NullPointerException, IOException{
        if (DataController.userManager.addUser(user)) {
            //System.out.println(userManager.toString());
            this.setUserManager(userManager);
            this.exitScreen();
        } else {

            //System.out.println(MainController.userManager.getUser(user.getUsername()).getUsername() + " " + MainController.userManager.getUser(user.getUsername()).getUsername());
        }
    }


    public void exitScreen() throws IOException{

        Parent creation = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
        Scene tableViewScene = new Scene(creation);

        // Instead of retrieving the stage by the event's source, you can do it by one of your FXML component.
        Stage window = (Stage) btnExit.getScene().getWindow();
        window.close();
        window.setScene(tableViewScene);
        window.show();
    }

}
