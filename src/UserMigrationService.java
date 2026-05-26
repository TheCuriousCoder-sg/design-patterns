public class UserMigrationService {
    public void migrateUser() {
        User user = new User.UserBuilder()
                        .setAge(30)
                        .setName("Rahul")
                        .setEmail("rahul@gmail.com")
                        .build();

        System.out.println("User migrated -> " + user);
    }
}
