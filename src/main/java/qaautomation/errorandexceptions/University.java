package qaautomation.errorandexceptions;

import qaautomation.errorandexceptions.exceptions.NoFacultyAtUniversityException;
import qaautomation.errorandexceptions.faculty.Faculty;

public class University {
    private Faculty[] faculty;

    public University(Faculty[] faculty) throws NoFacultyAtUniversityException {
        setFaculty(faculty);
    }

    public double calculateGradePointForUniversity(String subjectName) {
       double sum = 0;
       int score = 0;
       for (Faculty faculty : faculty) {
           sum = sum + faculty.calculateGradePointForFaculty(subjectName);
           score++;
       }
       return sum = sum/score;
    }

    public Faculty[] getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty[] faculty) throws NoFacultyAtUniversityException {
        if (faculty.length == 0)
            throw new NoFacultyAtUniversityException();
        this.faculty = faculty;
    }
}
