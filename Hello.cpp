// Copyright (c) 2025 Linh Huynh
// Created by: Linh Huynh
// Created on: Oct 2025
// This program prints a conversation that gives users advice with friendly messages

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

string getInput() {
    string input;
    getline(cin, input);
    // remove spaces at both ends
    input.erase(0, input.find_first_not_of(" \t"));
    input.erase(input.find_last_not_of(" \t") + 1);
    // lowercase all
    transform(input.begin(), input.end(), input.begin(), ::tolower);
    return input;
}

int main() {
    string name, goodDay, problem, moreProblem = "yes";

    cout << "Hello, I'm Linh — your virtual buddy!" << endl;
    cout << "How can I call you? Please enter your name: ";
    getline(cin, name);

    cout << "Hi " << name << "! Are you having a good day today? (Yes/No)" << endl;

    // Validation for Yes/No
    while (true) {
        goodDay = getInput();
        if (goodDay == "yes" || goodDay == "no") break;
        cout << "Invalid input, please type Yes or No!" << endl;
    }

    // Response
    if (goodDay == "yes") {
        cout << "\nPerfect, I’m really happy to hear that, " << name << "!" << endl;
        cout << "Let’s keep that positive energy going!\n" << endl;
    } else {
        cout << "\nOh no… I’m sorry to hear that, " << name << "." << endl;
        cout << "Maybe chatting a bit can make things better. I’m here for you\n" << endl;
    }

    // Main conversation loop
    while (moreProblem == "yes") {
        cout << "So, what kind of problem do you have today?" << endl;
        cout << "Please type one of these options (Health / School / Money): " << endl;

        while (true) {
            problem = getInput();
            if (problem == "health" || problem == "school" || problem == "money") break;
            cout << "⚠️ Please choose only from: HEALTH, SCHOOL, or MONEY!" << endl;
        }

        if (problem == "health") {
            cout << "🩺 Got it! Is it a Physical or Mental health issue?" << endl;
            string healthProblem;

            while (true) {
                healthProblem = getInput();
                if (healthProblem == "physical" || healthProblem == "mental") break;
                cout << "⚠️ Please enter either Physical or Mental!" << endl;
            }

            if (healthProblem == "physical") {
                cout << "\nPhysical advice:" << endl;
                cout << "• Get enough rest and drink plenty of water." << endl;
                cout << "• Stretch or move around if you sit a lot." << endl;
                cout << "• If pain lasts too long, please see a doctor.\n" << endl;
            } else {
                cout << "\nMental advice:" << endl;
                cout << "• Take short breaks and breathe slowly." << endl;
                cout << "• Talk to a close friend or counselor." << endl;
                cout << "• Remember: bad days don’t last forever.\n" << endl;
            }
        }
        else if (problem == "school") {
            cout << "School huh? Are you struggling with Work or Motivation?" << endl;
            string schoolProblem;

            while (true) {
                schoolProblem = getInput();
                if (schoolProblem == "work" || schoolProblem == "motivation") break;
                cout << "⚠️ Please enter Work or Motivation!" << endl;
            }

            if (schoolProblem == "work") {
                cout << "\nWork advice:" << endl;
                cout << "• Make a to-do list and do one small thing first." << endl;
                cout << "• Take 10-minute breaks after focused study." << endl;
                cout << "• You don’t have to finish everything at once, small steps matter!\n" << endl;
            } else {
                cout << "\nMotivation advice:" << endl;
                cout << "• Think about your goals and how far you’ve come." << endl;
                cout << "• Reward yourself after finishing something small." << endl;
                cout << "• Even a tiny bit of effort today makes tomorrow easier.\n" << endl;
            }
        }
        else if (problem == "money") {
            cout << "Ah, money problems — we’ve all been there!" << endl;
            cout << "Here are a few thoughts:" << endl;
            cout << "• Try tracking your expenses for a week." << endl;
            cout << "• Save a small amount regularly (even $5 counts!)." << endl;
            cout << "• Don’t stress too much — money can’t buy peace of mind.\n" << endl;
        }

        cout << "Would you like to talk about another problem? (Yes/No)" << endl;
        while (true) {
            moreProblem = getInput();
            if (moreProblem == "yes" || moreProblem == "no") break;
            cout << "Invalid input, please enter Yes or No!" << endl;
        }

        if (moreProblem == "yes") {
            cout << "\nAlright, let's see what else we can talk about!\n" << endl;
        }
    }

    cout << "\nThanks for chatting with me, " << name << "!" << endl;
    cout << "Remember: you’re doing great, and tomorrow is a new chance " << endl;

    return 0;
}
