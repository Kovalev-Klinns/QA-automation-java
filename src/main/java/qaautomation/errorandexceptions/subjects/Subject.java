package qaautomation.errorandexceptions.subjects;

public class Subject {
    private String subjectName;
    private int assessment;

    public Subject(String subjectName, int assessment) throws AssessmentException {
        this.subjectName = subjectName;
        this.assessment = assessment;
        if (assessment <= 0 || assessment > 10) throw new AssessmentException();
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

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Предмет - " + subjectName + "; Оценка: " + assessment + ".";
    }
}


