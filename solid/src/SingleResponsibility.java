

/*
*   Single Responsibility Principle
*   A class should have only one reason to change
*   Do not mix concerns. A should do one thing well - logging, parsing or computing - but not all
* */
public class SingleResponsibility {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository();
        EmailService emailService = new EmailService();
        UserService userService = new UserService(validator, repository, emailService);
        userService.registerUser("john", "john@work.com");
    }

}

record UserService(UserValidator validator, UserRepository repository, EmailService emailService) {

    public void registerUser(String name, String email) {
        if (validator.validate(name, email)) {
            repository.save(name, email);
            emailService.sendWelcomeEmail(name);
        } else {
            System.out.println("Error registering the user, please check the details provided");
        }
    }
}

class UserValidator {
    public boolean validate(String name, String email) {
        return name != null && (email != null && email.contains("@"));
    }
}

class UserRepository {
    public void save(String name, String email) {
        System.out.println("Saving user: " + name + ", email: " + email);
    }

}

class EmailService {
    public void sendWelcomeEmail(String user) {
        System.out.println("Sending welcome user to " + user);
    }
}


