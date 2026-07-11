public class Chatbot implements CustomerSupportHandler{
    private CustomerSupportHandler customerSupportHandler;

    public Chatbot(CustomerSupportHandler customerSupportHandler) {
        this.customerSupportHandler = customerSupportHandler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL1")) {
            // Chatbot Logic
            System.out.println("Chatbot resolved the issue");
            issue.setStatus("SUCCESS");
        } else {
            System.out.println("Chatbot could not resolve the issue. " +
                    "Moving to the next handler");
            issue.setStatus("PENDING");
            customerSupportHandler.handleRequest(issue);
        }
    }
}
