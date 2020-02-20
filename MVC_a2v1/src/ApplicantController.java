import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class ApplicantController extends DataController {

    @FXML
    private Button btnSubmit;

    @FXML
    private Button btnApplyToJobs;

    @FXML
    private Button btnJobStat;

    @FXML
    private Button btnAccountHist;

    @FXML
    private Button btnLogout;

    @FXML
    private AnchorPane pnSubmitResume;

    @FXML
    private AnchorPane pnApply;

    @FXML
    private ListView<?> lstJobs;

    @FXML
    private Button btnApply;

    @FXML
    private AnchorPane pnJobStatus;

    @FXML
    private Label lblJobsApplied;

    @FXML
    private ListView<?> lstJobsApplied;

    @FXML
    private Button btnWithdraw;

    @FXML
    private AnchorPane pnAcntHist;

    @FXML
    private Label lblAcntHist;

    /*public void apply(ActionEvent event){
        Applicant a = (Applicant) loggedUser;
        String selectedRadio = (((RadioButton) radioSet.getSelectedToggle()).getText());
        Button back = new Button("Back");
        //jobManager.getJob(selectedRadio).addApplicant(a);
        //a.applyToJob(jobManager.getJob(selectedRadio));
        a.applyToJob(MainController.systemAdmin.getJobManager().getJob(selectedRadio));
    }*/

    public void submitResume(ActionEvent event) throws Exception{
        pnSubmitResume.setVisible(true);
        pnAcntHist.setVisible(false);
        pnApply.setVisible(false);
        pnJobStatus.setVisible(false);
    }

    public void applyToJob(ActionEvent event) throws Exception{
        pnSubmitResume.setVisible(false);
        pnAcntHist.setVisible(false);
        pnApply.setVisible(true);
        pnJobStatus.setVisible(false);

    }

    public void viewJobStatus(ActionEvent event) throws Exception{
        pnSubmitResume.setVisible(false);
        pnAcntHist.setVisible(false);
        pnApply.setVisible(false);
        pnJobStatus.setVisible(true);
    }

    public void accountHistory(ActionEvent event) throws Exception{
        pnSubmitResume.setVisible(false);
        pnAcntHist.setVisible(true);
        pnApply.setVisible(false);
        pnJobStatus.setVisible(false);
        //lblAcntHist.setText(((Applicant) MainController.userManager).getInfo()));
    }

}
