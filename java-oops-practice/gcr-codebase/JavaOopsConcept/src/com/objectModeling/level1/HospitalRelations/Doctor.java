package com.objectModeling.level1.HospitalRelations;

public class Doctor {
    String doctorName;

    Doctor(String doctorName) {
        this.doctorName = doctorName;
    }

    void consult(Patient patient) {
        System.out.println("Doctor " + doctorName + " is consulting patient " + patient.patientName);
    }
}
