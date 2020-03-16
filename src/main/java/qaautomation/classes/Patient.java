package qaautomation.classes;
import qaautomation.classes.cards.*;

public class Patient {
    private MedCard medCard;
    private PersonalCard personalCard;

    public Patient(MedCard medCard, PersonalCard personalCard) {
        this.medCard = medCard;
        this.personalCard = personalCard;
    }

    public MedCard getMedCard() {
        return medCard;
    }

    public void setMedCard(MedCard medCard) {
        this.medCard = medCard;
    }

    public PersonalCard getPersonalCard() {
        return personalCard;
    }

    public void setPersonalCard(PersonalCard personalCard) {
        this.personalCard = personalCard;
    }

    @Override
    public String toString() {
        return personalCard.toString() + " || " + medCard.toString();
    }
}