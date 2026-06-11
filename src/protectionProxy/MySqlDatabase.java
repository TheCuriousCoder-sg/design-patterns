package protectionProxy;

public class MySqlDatabase implements Database{
    @Override
    public void delete() {
        System.out.println("User Deleted");
    }
}
