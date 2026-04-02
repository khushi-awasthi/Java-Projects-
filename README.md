# Java-Projects-

## 🎮 Number Guessing Game
- Language: Java
- Features:
  - Random number generation
  - Too high / Too low hints
  - Attempt counter

👉 File: NumberGuessingGame.java


##  StudentGradeTracker


A simple Java console application to manage student records, calculate performance metrics, and display a ranked leaderboard.

📌 Overview

The Student Grade Tracker allows users to input student names and scores, then performs various operations like:

Calculating the average score
Finding highest and lowest scorers
Displaying students above average
Generating a leaderboard with proper ranking (including ties)
🚀 Features
🧾 Add multiple students with scores
📊 Compute class average
🔝 Identify highest & lowest scoring students
⭐ Filter students scoring above average
🏆 Leaderboard with ranking system (tie-aware)
🛠️ Technologies Used
Java
Java Collections Framework
HashMap
ArrayList
Collections.sort
Scanner (for user input)
📂 File Structure
StudentGradeTracker.java
README.md
▶️ How to Run
Step 1: Compile
javac StudentGradeTracker.java
Step 2: Execute
java StudentGradeTracker
💻 Sample Execution
Enter number of students: 3
Enter name: Khushi
Enter score: 90
Enter name: Rahul
Enter score: 85
Enter name: Ankit
Enter score: 90

Student Records:
Khushi -> 90
Rahul -> 85
Ankit -> 90

Average Score: 88.33

Highest: Khushi (90)
Lowest: Rahul (85)

Students Above Average:
Khushi -> 90
Ankit -> 90

🏆 Leaderboard:
Rank 1: Khushi (90)
Rank 1: Ankit (90)
Rank 3: Rahul (85)
🧠 Concepts Covered
Data structures using HashMap
Iterating through collections (Map.Entry)
Sorting using custom comparator
Ranking algorithm with tie handling
Basic input/output in Java
