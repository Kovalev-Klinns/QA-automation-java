package qaautomation.classes.cards;

public class MedCard  {
    private int MedCardNumber;
    private String diagnosis;

    public MedCard(int MedCardNumber, String diagnosis) {
        this.MedCardNumber = MedCardNumber;
        this.diagnosis = diagnosis;
    }

    public int getMedCardNumber() {
        return MedCardNumber;
    }

    public void setMedCardNumber(int medCardNumber) {
        MedCardNumber = medCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    @Override
    public String toString() {
        return "Номер мед.карты: " + MedCardNumber + ", диагноз: " + diagnosis;
    }
}
