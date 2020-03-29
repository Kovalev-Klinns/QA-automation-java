package qaautomation.errorandexceptions.exceptions;

public class NoFacultyAtUniversityException extends Exception {
    public NoFacultyAtUniversityException() {
        System.err.println("University should contain at least 1 faculty");
    }
}
