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
       for (int i = 0; i < faculty.length; i++) {
           for (int j = 0; j < faculty[i].getGroupOfStudents().length; j++) {
               for (int k = 0; k < faculty[i].getGroupOfStudents()[j].getStudentsOfGroup().length; k++) {
                   for (int l = 0; l < faculty[i].getGroupOfStudents()[j].getStudentsOfGroup()[k].getSubjects().length; l++) {
                       if (faculty[i].getGroupOfStudents()[j].getStudentsOfGroup()[k].getSubjects()[l].getSubjectName().equals(subjectName)) {
                           sum += faculty[i].getGroupOfStudents()[j].getStudentsOfGroup()[k].getSubjects()[l].getAssessment();
                           score++;
                       }
                   }
               }
           }
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
