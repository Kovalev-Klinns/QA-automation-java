package qaautomation.classes.cards;

public class PersonalCard  {
    private String surname;
    private String firstName;
    private String secondName;
    private int id;
    private String address;
    private int phoneNumber;

    public PersonalCard (String surname, String firstName, String secondName, int id, String address, int phoneNumber){
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "ID: " + id + ". " + surname + " " + firstName + " " + secondName + ". Адрес: " + address + ". Телефон: " + phoneNumber;
    }
}