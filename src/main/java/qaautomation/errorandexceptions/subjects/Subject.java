package qaautomation.errorandexceptions.subjects;

import qaautomation.errorandexceptions.exceptions.AssessmentException;

public class Subject  {
    private String subjectName;
    private int assessment;

    public Subject(String subjectName, int assessment) throws AssessmentException {
        setSubjectName(subjectName);
        setAssessment(assessment);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) throws AssessmentException {
        if (assessment < 1 || assessment > 10)
            throw new AssessmentException();
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Предмет - " + subjectName + "; Оценка: " + assessment + ".";
    }
}


