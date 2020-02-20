import java.util.ArrayList;

public class Company {

    private HR hrCoordinator;
    private ArrayList<JobPosting> jobPostings;
    private String companyName;

    public Company(String companyName, HR hrCoordinator){
        this.hrCoordinator = hrCoordinator;
        this.companyName = companyName;
    }

    public void setHrCoordinator(HR hrCoordinator){ this.hrCoordinator = hrCoordinator; }

    public HR getHrCoordinator(){ return this.hrCoordinator; }
}
