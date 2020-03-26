package qaautomation.errorandexceptions.faculty;

public class NoGroupAtFacultyException extends Exception {
    public NoGroupAtFacultyException() {
        System.err.println("Faculty should contain at least 1 group");
    }
}
