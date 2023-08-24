public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging: " + message);
    }
}

class UserService {
    private Logger logger; // Dependency

    public UserService(Logger logger) {
        this.logger = logger; // Dependency Injection
    }

    public void createUser(String username) {
        // User creation logic

        // Logging using the injected Logger
        logger.log("User created: " + username);
    }
}

// Main.java
class main {
    public static void main(String[] args) {
        // Creating a ConsoleLogger instance
        Logger logger = new ConsoleLogger();

        // Injecting the logger into the UserService
        UserService userService = new UserService(logger);

        // Using the UserService with injected Logger
        userService.createUser("john_doe");
    }
}
