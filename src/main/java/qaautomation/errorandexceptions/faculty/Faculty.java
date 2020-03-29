package qaautomation.errorandexceptions.faculty;

import qaautomation.errorandexceptions.exceptions.NoGroupAtFacultyException;
import qaautomation.errorandexceptions.students.GroupOfStudents;

abstract public class Faculty {
    private GroupOfStudents[] groupOfStudents;

     public Faculty(GroupOfStudents[] groupOfStudents) throws NoGroupAtFacultyException {
        this.groupOfStudents = groupOfStudents;
        setGroupOfStudents(groupOfStudents);
    }

    public double calculateGradePointForFaculty (String subjectName) {
         double sum = 0;
         byte score = 0;
         for (int i = 0; i < groupOfStudents.length; i++) {
             for(int j = 0; j < groupOfStudents[i].getStudentsOfGroup().length; j++) {
                 for(int k = 0; k < groupOfStudents[i].getStudentsOfGroup()[j].getSubjects().length; k++) {
                     if (groupOfStudents[i].getStudentsOfGroup()[j].getSubjects()[k].getSubjectName().equals(subjectName)) {
                         sum += groupOfStudents[i].getStudentsOfGroup()[j].getSubjects()[k].getAssessment();
                         score++;
                     }
                 }
             }
         }
         return sum/score;
    }

    public GroupOfStudents[] getGroupOfStudents() {
        return groupOfStudents;
    }

    public void setGroupOfStudents(GroupOfStudents[] groupOfStudents) throws NoGroupAtFacultyException {
        this.groupOfStudents = groupOfStudents;
        if (groupOfStudents.length == 0)
            throw new NoGroupAtFacultyException();
    }
}
