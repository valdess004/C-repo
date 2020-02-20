import java.time.Instant;
import java.util.Date;
import java.util.HashMap;

public class Applicant extends User {
    private HashMap<JobPosting, String> jobsApplied = new HashMap<>();

    public Applicant(String username, String password) {
        super(username, password);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public Date getDateCreated() {
        return super.getDateCreated();
    }

    private String getJobs() {
        StringBuilder s = new StringBuilder();
        if (!this.jobsApplied.isEmpty()) {
            for (JobPosting job : this.jobsApplied.keySet()) {
                s.append(job.getPosition()).append("\n");
            }
        } else {
            s.append("Applicant has not applied for a job");
        }
        return s.toString();
    }

    private String getJobHistory() {
        StringBuilder history = new StringBuilder();
        if (!this.jobsApplied.isEmpty()) {
            Date today = new Date();
            Instant now = Instant.now();
            today.from(now);
            for (JobPosting job : this.jobsApplied.keySet()) {
                if (today.after(job.getDateClosed())) {
                    history.append(job.getPosition()).append(" - CLOSED: ").append(job.getDateClosed()).append("\n");
                } else {
                    history.append(job.getPosition()).append("- OPEN\n");
                }
            }
        }
        return history.toString();
    }

    private void applyToJob(JobPosting jobPosting) {
        this.jobsApplied.put(jobPosting, "Submitted Resume/CV");
        jobPosting.addApplicant(this);
    }

    private void withdrawApplication(JobPosting jobPosting) {
        jobPosting.removeApplicant(this);
        this.updateStatus(jobPosting, "Application withdrawn");
    }


    String getInfo() {
        return "Applicant Username: " + this.getUsername() + '\n' +
                "\n Date Created: " + this.getDateCreated() + "\n" +
                "\nJobs Applied To:\n" + this.getJobHistory();
    }

    @Override
    public String toString() {
        return "{A," + this.getJobs() + "," + this.getUsername() + "," + this.getPassword() + "}";
    }

    private String getJobStatus(JobPosting jobPosting) {
        return this.jobsApplied.get(jobPosting);
    }

    void updateStatus(JobPosting job, String status) {
        this.jobsApplied.put(job, status);
    }
}
