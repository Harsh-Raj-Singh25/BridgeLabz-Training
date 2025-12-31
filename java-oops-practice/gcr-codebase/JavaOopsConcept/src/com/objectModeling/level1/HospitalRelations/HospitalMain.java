package com.objectModeling.level1.HospitalRelations;

import java.util.*;

public class HospitalMain {
    public static void main(String[] args) {
    	// creating a new hospital
        Hospital hospital = new Hospital("City Hospital");
        // define the doctors
        Doctor drRam = new Doctor("Dr. Ram");
        Doctor drShyam = new Doctor("Dr. Shyam");
        // define patients
        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Neha");
        // adding the doctors to the hospital
        hospital.addDoctor(drRam);
        hospital.addDoctor(drShyam);
        // adding the patients
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        // appointing the doctors
        drRam.consult(p1);
        drRam.consult(p2);
        drShyam.consult(p1);
    }
}