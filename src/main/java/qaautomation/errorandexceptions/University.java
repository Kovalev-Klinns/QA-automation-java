package qaautomation.errorandexceptions;

import qaautomation.errorandexceptions.exceptions.NoFacultyAtUniversityException;
import qaautomation.errorandexceptions.faculty.Faculty;
import qaautomation.errorandexceptions.students.GroupOfStudents;
import qaautomation.errorandexceptions.students.Student;
import qaautomation.errorandexceptions.subjects.Subject;

public class University {
    private Faculty[] faculty;

    public University(Faculty[] faculty) throws NoFacultyAtUniversityException {
        setFaculty(faculty);
    }

    public double calculateGradePointForUniversity(String subjectName) {
       double sum = 0;
       int score = 0;
       for (Faculty faculty : faculty) {
           for (GroupOfStudents groupOfStudents : faculty.getGroupOfStudents()) {
               for (Student studentOfGroup : groupOfStudents.getStudentsOfGroup()) {
                   for (Subject subject : studentOfGroup.getSubjects()) {
                       if (subject.getSubjectName().equals(subjectName)) {
                           sum += subject.getAssessment();
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
