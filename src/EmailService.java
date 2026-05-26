public class EmailService {
    public void sendWelcomeEmail() {
        User user = new User.UserBuilder()
                .setEmail("aman@gmail.com")
                .setAge(35)
                .setName("Aman")
                .build();

        System.out.println("Welcome email sent to -> " + user);
    }
}
