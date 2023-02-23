package oop.practice.classes.patient;

public class PatientService {
    private final Patient[] patients;

    public PatientService(Patient[] patients) {
        this.patients = patients;
    }

    public void checkMedicalCard(int startInterval, int endInterval) {
        for (Patient patient : patients) {
            if (patient.getMedicalCardNumber() >= startInterval && patient.getMedicalCardNumber() <= endInterval) {
                System.out.println("(id " + patient.getId() + ") " + patient.getFirstName() +
                        " " + patient.getLastName() + " " + patient.getPatronymic() +
                        " [medical card number: " + patient.getMedicalCardNumber() + "]");
            }
        }
    }

    public void checkDiagnosis(String diagnosis) {
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals(diagnosis)) {
                System.out.println("(id " + patient.getId() + ") " + patient.getFirstName() +
                        " " + patient.getLastName() + " " + patient.getPatronymic() +
                        "  [diagnosis - " + patient.getDiagnosis() + "]");
            }
        }
    }
}
