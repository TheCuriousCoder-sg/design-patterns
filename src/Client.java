public class Client {
    private CustomerSupportHandler handler;

    public Client(CustomerSupportHandler handler) {
        this.handler = handler;
    }

    public void raiseIssue(Issue issue) {
        handler.handleRequest(issue);
    }
}
