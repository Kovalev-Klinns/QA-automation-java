package qaautomation.errorandexceptions.exceptions;

public class AssessmentException extends Exception{
    public AssessmentException() {
        System.err.println("The assessment cannot be more than 10 or less than 1");
    }
}
