public class CustomerExecutive implements CustomerSupportHandler{

    private CustomerSupportHandler handler;

    public CustomerExecutive(CustomerSupportHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL2")) {
            // Executive Logic
            System.out.println("Executive resolved the issue");
            issue.setStatus("SUCCESS");
        } else {
            System.out.println("Executive could not resolve the issue. " +
                    "Moving to the next handler");
            issue.setStatus("PENDING");
            handler.handleRequest(issue);
        }
    }
}
