package com.day3.examProctor;
/*
 * 11. ExamProctor – Online Exam Review System (Stack + HashMap + Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.
 */
import java.util.HashMap;
 
import java.util.HashMap;

public class ExamProctorMain {
    
    // 🏆 Scoring Function: Compares student answers against the Answer Key
    public static int calculateScore(HashMap<String, String> studentAnswers, HashMap<String, String> answerKey) {
        int score = 0;
        for (String qID : answerKey.keySet()) {
            // Check if the student even answered the question
            if (studentAnswers.containsKey(qID)) {
                if (studentAnswers.get(qID).equalsIgnoreCase(answerKey.get(qID))) {
                    score++;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        // Setup the Navigation History (Your Stack)
        StackLinkedList navHistory = new StackLinkedList();
        
        //  Setup the Answer Storage (HashMap)
        HashMap<String, String> studentAnswers = new HashMap<>();
        
        //  Setup the Correct Answer Key (For Evaluation)
        HashMap<String, String> answerKey = new HashMap<>();
        answerKey.put("Q1", "Java");
        answerKey.put("Q2", "10");
        answerKey.put("Q3", "Compiler");

        // --- SIMULATION ---
        
        // Student visits Q1 and answers
        navHistory.push("Q1");
        studentAnswers.put("Q1", "Java");

        // Student visits Q2 and answers
        navHistory.push("Q2");
        studentAnswers.put("Q2", "12"); // Wrong answer

        // Student visits Q3 and answers
        navHistory.push("Q3");
        studentAnswers.put("Q3", "Compiler");

        // Student decides to go BACK (Undo navigation)
        System.out.println("<- Going back from: " + navHistory.pop());
        System.out.println(" Current Question: " + navHistory.peek());

        // Final Submission
        int finalScore = calculateScore(studentAnswers, answerKey);
        
        System.out.println("\n--- Exam Result ---");
        System.out.println("Total Score: " + finalScore + " / " + answerKey.size());
    }
}
