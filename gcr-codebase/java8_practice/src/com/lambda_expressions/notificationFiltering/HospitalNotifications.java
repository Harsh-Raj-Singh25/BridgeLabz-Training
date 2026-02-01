package com.lambda_expressions.notificationFiltering;

import java.util.*;
import java.util.function.Predicate;

public class HospitalNotifications {
    public static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {
        for (Alert alert : alerts) {
            if (condition.test(alert)) {
                System.out.println("NOTIFY: [" + alert.priority + "] " + alert.message);
            }
        }
    }

    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Patient Heart Rate High", "Critical", "ICU"),
            new Alert("New Lab Results Available", "Normal", "Diagnostics"),
            new Alert("Pharmacy Restock Reminder", "Low", "Pharmacy")
        );

        System.out.println("--- Doctor's View (Only Critical) ---");
        filterAlerts(alerts, a -> a.priority.equals("Critical"));

        System.out.println("\n--- ICU Nurse's View (Critical or ICU) ---");
        filterAlerts(alerts, a -> a.priority.equals("Critical") || a.department.equals("ICU"));
    }
}