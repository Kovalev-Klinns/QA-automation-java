package qaautomation.classes;

import qaautomation.classes.cards.*;
//Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
// Создать массив объектов. Вывести: a) список пациентов, имеющих данный диагноз;
//b) список пациентов, номер медицинской карты которых находится в заданном интервале.

public class ClinicManager {
    public static void main(String[] args) {

        Patient oleg = new Patient (new MedCard(1999,"Гастрит"), new PersonalCard("Cоболев", "Олег", "Александрович", 11, "Мясникова 2", 375219));
        Patient alex = new Patient (new MedCard(2001,"ОКР"), new PersonalCard("Свиридов", "Александр", "Иванович", 12, "Аэродромная 8", 375333));
        Patient maria = new Patient (new MedCard(3000,"ОКР"), new PersonalCard("Шевчук", "Мария", "Иогановна", 13, "Кавалерийская 25", 375098));
        Patient elon = new Patient (new MedCard(4999,"Гастрит"), new PersonalCard("Маск", "Илон", "Рив", 14, "Теслы 1", 375228));


        Patient[] patients = {oleg, alex, maria, elon};


        // Вывод пациентов с диагнозом "Гастрит"
        for (Patient patient : patients) {
            if (patient.getMedCard().getDiagnosis().equals("Гастрит")) {
                System.out.println(patient);
            }
        }
        System.out.println();

        // Вывод пациентов с номером медкарты в интервале от 2000 до 4000
        for (Patient patient : patients) {
            if (patient.getMedCard().getMedCardNumber() <= 4000 && patient.getMedCard().getMedCardNumber() >= 2000) {
                System.out.println(patient);
            }
        }
    }
}