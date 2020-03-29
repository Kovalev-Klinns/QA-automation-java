package qaautomation.errorandexceptions.students;

import qaautomation.errorandexceptions.exceptions.NoStudentInGroupException;

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
        for(int i = 0; i < studentsOfGroup.length; i++) {
            for (int j = 0; j < studentsOfGroup[i].getSubjects().length; j++) {
                if (studentsOfGroup[i].getSubjects()[j].getSubjectName().equals(subjectName)) {
                    sum += studentsOfGroup[i].getSubjects()[j].getAssessment();
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
