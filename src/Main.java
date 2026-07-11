public class Main {
    public static void main(String[] args) {
        Client client = new Client(new Chatbot(new CustomerExecutive(new TechTeam())));
        client.raiseIssue(new Issue("LEVEL3", "INITIATED"));
    }
}