import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

abstract class DataController {

    @FXML
    private Button btnLogout;

    public static UserAccess userManager = new UserAccess();
    public static SystemAdmin systemAdmin = new SystemAdmin();

    public static UserAccess getUserManager(){
        return userManager;
    }
    public static SystemAdmin getSystemAdmin(){
        return systemAdmin;
    }

    public void setUserManager(UserAccess u){
        this.userManager = u;
    }
    public void setSystemAdmin(SystemAdmin s){
        this.systemAdmin = s;
    }

    public void logout(ActionEvent event) throws Exception{

        Parent creation = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
        Scene tableViewScene = new Scene(creation);

        // Instead of retrieving the stage by the event's source, you can do it by one of your FXML component.
        Stage window = (Stage) btnLogout.getScene().getWindow();
        window.close();
        window.setScene(tableViewScene);
        window.show();

        //((Stage) btnExit.getScene().getWindow()).close();
        //Stage stage = (Stage) exit.getScene().getWindow();
        // do what you have to do
        //stage.close();
    }
}
