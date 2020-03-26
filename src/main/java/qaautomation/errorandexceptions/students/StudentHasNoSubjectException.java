package qaautomation.errorandexceptions.students;

public class StudentHasNoSubjectException extends Exception {
    public StudentHasNoSubjectException() {
        System.err.println("The student should have at least one subject");
    }
}
