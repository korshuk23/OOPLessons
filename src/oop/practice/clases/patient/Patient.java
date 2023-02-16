package oop.practice.clases.patient;

public class Patient {
    private long id;
    private String firstName, lastName, patronymic;
    private String address;
    private String phoneNumber;
    private long medicalCardNumber;
    private String diagnosis;
    private static long counter = 1L;

    public Patient(String lastName, String firstName, String patronymic, String address, String phoneNumber, long medicalCardNumber, String diagnosis) {
        id = counter++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(long medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "classes.entity.Patient:\n" +
                "id " + id +
                ", Surname: " + lastName +
                ", Name: " + firstName +
                ", Отчество: " + patronymic +
                ", Address: " + address +
                ", Phone number: " + phoneNumber +
                ", Medical card number: " + medicalCardNumber +
                ", Diagnosis: " + diagnosis;
    }
}
