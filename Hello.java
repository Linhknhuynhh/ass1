package Assignment;
// Created by: Linh Huynh
// Created on: Oct 2025
// This program prints a conversation that gives users advice with friendly messages

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // greeting
        System.out.println("Hello, I'm Linh!");
        System.out.print("How can I call you? Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Hi " + name + "! Are you having a good day today? (Yes/No)");
        String goodDay = "";

        // Yes/No
        while (true) {
            try {
                goodDay = input.nextLine().trim().toLowerCase();
                if (!goodDay.equals("yes") && !goodDay.equals("no")) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please type Yes or No!");
            }
        }

        // how their day is going
        if (goodDay.equals("yes")) {
            System.out.println("\nPerfect, I’m really happy to hear that, " + name + "!");
            System.out.println("Let’s keep that positive energy going!\n");
        } else {
            System.out.println("\nOh no… I’m sorry to hear that, " + name + ".");
            System.out.println("Maybe chatting a bit can make things better. I’m here for you \n");
        }

        String moreProblem = "yes";
        while (moreProblem.equals("yes")) {

            // kind of problem
            System.out.println("So, what kind of problem do you have today?");
            System.out.println("Please type one of these options (Health / School / Money): ");
            String problem = "";

            while (true) {
                try {
                    problem = input.nextLine().trim().toLowerCase();
                    if (!problem.equals("health") && !problem.equals("school") && !problem.equals("money"))
                        throw new Exception();
                    break;
                } catch (Exception e) {
                    System.out.println("Please choose only from: HEALTH, SCHOOL, or MONEY!");
                }
            }

            // switch case for 3 main problems
            switch (problem) {
                case "health":
                    System.out.println(" Got it! Is it a Physical or Mental health issue?");
                    String healthProblem = "";

                    while (true) {
                        try {
                            healthProblem = input.nextLine().trim().toLowerCase();
                            if (!healthProblem.equals("physical") && !healthProblem.equals("mental"))
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("⚠️ Please enter either Physical or Mental!");
                        }
                    }

                    if (healthProblem.equals("physical")) {
                        System.out.println("\n- >Physical advice:");
                        System.out.println("• Get enough rest and drink plenty of water.");
                        System.out.println("• Stretch or move around if you sit a lot.");
                        System.out.println("• If pain lasts too long, please see a doctor.\n");
                    } else {
                        System.out.println("\n-> Mental advice:");
                        System.out.println("• Take short breaks and breathe slowly.");
                        System.out.println("• Talk to a close friend or counselor.");
                        System.out.println("• Remember: bad days don’t last forever.\n");
                    }
                    break;

                case "school":
                    System.out.println("🎓 School huh? Are you struggling with Work or Motivation?");
                    String schoolProblem = "";

                    while (true) {
                        try {
                            schoolProblem = input.nextLine().trim().toLowerCase();
                            if (!schoolProblem.equals("work") && !schoolProblem.equals("motivation"))
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("⚠️ Please enter Work or Motivation!");
                        }
                    }

                    if (schoolProblem.equals("work")) {
                        System.out.println("\n-> Work advice:");
                        System.out.println("• Make a to-do list and do one small thing first.");
                        System.out.println("• Take 10-minute breaks after focused study.");
                        System.out.println("• You don’t have to finish everything at once, small steps matter!\n");
                    } else {
                        System.out.println("\n-> Motivation advice:");
                        System.out.println("• Think about your goals and how far you’ve come.");
                        System.out.println("• Reward yourself after finishing something small.");
                        System.out.println("• Even a tiny bit of effort today makes tomorrow easier.\n");
                    }
                    break;

                case "money":
                    System.out.println("Ah, money problems — we’ve all been there!");
                    System.out.println("Here are a few thoughts:");
                    System.out.println("• Try tracking your expenses for a week.");
                    System.out.println("• Save a small amount regularly (even $5 counts!).");
                    System.out.println("• Don’t stress too much — money can’t buy peace of mind.\n");
                    break;
            }

            // continue or not
            System.out.println("Would you like to talk about another problem? (Yes/No)");
            while (true) {
                try {
                    moreProblem = input.nextLine().trim().toLowerCase();
                    if (!moreProblem.equals("yes") && !moreProblem.equals("no")) throw new Exception();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input, please enter Yes or No!");
                }
            }

            if (moreProblem.equals("yes")) {
                System.out.println("\nAlright, let's see what else we can talk about!\n");
            }
        }

        System.out.println("\nThanks for chatting with me, " + name + "!");
        System.out.println("Remember you’re doing great, and tomorrow is a new chance");
        input.close();
    }
}
