package qaautomation.errorandexceptions.students;

import qaautomation.errorandexceptions.exceptions.NoStudentInGroupException;
import qaautomation.errorandexceptions.subjects.Subject;

public class GroupOfStudents {
    private int groupId;
    private Student[] studentsOfGroup;

    public GroupOfStudents(int groupId, Student[] studentsOfGroup) throws NoStudentInGroupException {
        this.groupId = groupId;
        setStudentsOfGroup(studentsOfGroup);
    }

    public double calculateGradePointForGroup(String subjectName) {
        double sum = 0;
        byte score = 0;
        for(Student studentOfGroup : studentsOfGroup) {
            for (Subject subject : studentOfGroup.getSubjects()) {
                if (subject.getSubjectName().equals(subjectName)) {
                    sum = sum + subject.getAssessment();
                    score++;
                }
            }
        }
        return sum/score;
        }
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Student[] getStudentsOfGroup() {
        return studentsOfGroup;
    }

    public void setStudentsOfGroup(Student[] studentsOfGroup) throws NoStudentInGroupException {
        if (studentsOfGroup.length == 0)
            throw new NoStudentInGroupException();
        this.studentsOfGroup = studentsOfGroup;
    }

    public String toString() {
        return "Группа " + groupId;
    }
}
