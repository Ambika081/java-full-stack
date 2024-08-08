  import java.util.Scanner;

// Custom exception class for marks out of range
class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

public class MarksValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks (between 1 to 100): ");

        try {
            int marks = scanner.nextInt();
            checkMarks(marks);
            System.out.println("Marks entered: " + marks);
        } catch (MarksOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer marks.");
        } finally {
            scanner.close();
        }
    }

    // Method to check if marks are in range
    public static void checkMarks(int marks) throws MarksOutOfRangeException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfRangeException("Marks should be between 1 to 100.");
        }
    }
}
