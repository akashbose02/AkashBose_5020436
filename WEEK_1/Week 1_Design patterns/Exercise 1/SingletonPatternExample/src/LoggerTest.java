public class LoggerTest {
    public static void main(String[] args) {
        // Step 4: Get the instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using the logger instance
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Step 4: Verify that only one instance is created
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
