package qaautomation.errorandexceptions.students;

import qaautomation.errorandexceptions.subjects.Subject;

public class Student {
    private String name;
    private Subject[] subjects;

    public Student(String name, Subject[] subjects) throws StudentHasNoSubjectException {
        this.name = name;
        this.subjects = subjects;

        if(subjects.length == 0) {
            throw new StudentHasNoSubjectException();
        }
    }

    public double calculateGradePointForStudent() {
        double sum = 0;
        for(int i = 0; i < subjects.length; i++) {
            sum = sum + subjects[i].getAssessment();
        }
        sum = sum/subjects.length;
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setSubjectName(String name) {
        this.name = name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String toString() {
        return name;
    }
}
