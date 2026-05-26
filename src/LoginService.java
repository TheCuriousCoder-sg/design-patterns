public class LoginService {
    void registerUser(String name, int age, String email, String city) {
        User user = new User.UserBuilder()
                .setName(name)
                .setAge(age)
                .setEmail(email)
                .setCity(city)
                .build();


        System.out.println("User Registered Successfully -> " + user);
    }
}
