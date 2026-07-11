public class TechTeam implements CustomerSupportHandler{
    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL3")) {
            // tech Team Logic
            System.out.println("Tech team resolved the issue");
            issue.setStatus("SUCCESS");
        } else {
            System.out.println("Issue could not be resolved");
            issue.setStatus("FAILED");
        }
    }
}
