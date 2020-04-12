package qaautomation.errorandexceptions.faculty;

import qaautomation.errorandexceptions.exceptions.NoGroupAtFacultyException;
import qaautomation.errorandexceptions.students.GroupOfStudents;
import qaautomation.errorandexceptions.students.Student;
import qaautomation.errorandexceptions.subjects.Subject;

abstract public class Faculty {
    private GroupOfStudents[] groupsOfStudents;

     public Faculty(GroupOfStudents[] groupOfStudents) throws NoGroupAtFacultyException {
        this.groupsOfStudents = groupOfStudents;
        setGroupOfStudents(groupOfStudents);
    }

    public double calculateGradePointForFaculty (String subjectName) {
         double sum = 0;
         byte score = 0;
         for (GroupOfStudents groupOfStudents : groupsOfStudents) {
             for(Student studentOfGroup : groupOfStudents.getStudentsOfGroup()) {
                 for(Subject subject : studentOfGroup.getSubjects()) {
                     if (subject.getSubjectName().equals(subjectName)) {
                         sum += subject.getAssessment();
                         score++;
                     }
                 }
             }
         }
         return sum/score;
    }

    public GroupOfStudents[] getGroupOfStudents() {
        return groupsOfStudents;
    }

    public void setGroupOfStudents(GroupOfStudents[] groupOfStudents) throws NoGroupAtFacultyException {
        this.groupsOfStudents = groupOfStudents;
        if (groupOfStudents.length == 0)
            throw new NoGroupAtFacultyException();
    }
}
