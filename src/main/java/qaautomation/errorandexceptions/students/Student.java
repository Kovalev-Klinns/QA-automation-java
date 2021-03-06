package qaautomation.errorandexceptions.students;

import qaautomation.errorandexceptions.exceptions.StudentHasNoSubjectException;
import qaautomation.errorandexceptions.subjects.Subject;

public class Student {
    private String name;
    private Subject[] subjects;

    public Student(String name, Subject[] subjects) throws StudentHasNoSubjectException {
        this.name = name;
        setSubjects(subjects);
    }

    public double calculateGradePointForStudent() {
        double sum = 0;
        for(Subject subject : subjects) {
            sum = sum + subject.getAssessment();
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

    public void setSubjects(Subject[] subjects) throws StudentHasNoSubjectException {
        if(subjects.length == 0)
            throw new StudentHasNoSubjectException();
        this.subjects = subjects;
    }

    public String toString() {
        return name;
    }
}
