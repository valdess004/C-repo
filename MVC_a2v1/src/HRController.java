import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class HRController extends DataController{
    @FXML
    private Button btnAddJob;

    @FXML
    private Button btnManageJobs;

    @FXML
    private Button btnViewApps;

    @FXML
    private Button btnLogout;

    @FXML
    private StackPane stkpn;

    @FXML
    private AnchorPane pnViewApps;

    @FXML
    private ListView<?> lstAppData;

    @FXML
    private Button btnAppData;

    @FXML
    private Label lblAppData;

    @FXML
    private AnchorPane pnManageJobs;

    @FXML
    private Button btnViewApplied;

    @FXML
    private Button btnDistribute;

    @FXML
    private ListView<?> lstJobs;

    @FXML
    private Label lblChooseJob;

    @FXML
    private ListView<?> lstApplied;

    @FXML
    private AnchorPane pnAddJob;

    @FXML
    private Button btnAddStage;

    @FXML
    private TextField txtPosition;

    @FXML
    private TextField txtCompany;

    @FXML
    private TextField txtIntStage;

    @FXML
    private Button btnAddInt;

    @FXML
    private ComboBox<?> cmbInt;

    @FXML
    private ListView<?> lstIntStage;

    @FXML
    private Button btnCreateJob;

    @FXML
    private ListView<?> lstInterviewers;

    @FXML
    private DatePicker dpClose;


    public void createJob(ActionEvent event) throws Exception{
        pnAddJob.setVisible(true);
        pnManageJobs.setVisible(false);
        pnViewApps.setVisible(false);
        ObservableList<String> listStages = FXCollections.observableArrayList();
        ObservableList<String> chosenInterviewers = FXCollections.observableArrayList();
        btnCreateJob.setOnAction((ActionEvent CreateJob) -> {
            if (!listStages.isEmpty()){
                Date closeDate = Date.from(dpClose.getValue().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
                String position = txtPosition.getText();
                String company = txtCompany.getText();
                ArrayList<String> listIntStages = new ArrayList<>();
                for (String str: listStages){
                    listIntStages.add(str);
                }
                ArrayList<Interviewer> decidedListOfInt= new ArrayList<>();
                for (String str: chosenInterviewers){
                    decidedListOfInt.add((Interviewer)this.getUserManager().getUser(str));
                }
                this.getSystemAdmin().getJobManager().addJob(closeDate, position, 0, company, listIntStages, decidedListOfInt);//---------------------------------------------
                System.out.println("Added");
                //stage.setScene(HRBasePage);
            }
        });
    }

    public void manageJobs(ActionEvent event) throws Exception{
        pnManageJobs.setVisible(true);
        pnAddJob.setVisible(false);
        pnViewApps.setVisible(false);
    }

    public void viewApps(ActionEvent event) throws Exception{
        pnViewApps.setVisible(true);
        pnManageJobs.setVisible(false);
        pnAddJob.setVisible(false);
    }

    public void logout(ActionEvent event) throws  Exception{
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
