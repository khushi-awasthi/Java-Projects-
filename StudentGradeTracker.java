import java.util.*;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();

        addStudents(sc, students);
        displayStudents(students);

        double avg = calculateAverage(students);
        System.out.println("\nAverage Score: " + avg);

        findHighestLowest(students);
        studentsAboveAverage(students, avg);

        // 🏆 Leaderboard
        displayLeaderboard(students);

        sc.close();
    }

    // 🔹 Add students
    public static void addStudents(Scanner sc, HashMap<String, Integer> map) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter score: ");
            int score = sc.nextInt();
            sc.nextLine();

            map.put(name, score);
        }
    }

    // 🔹 Display students
    public static void displayStudents(HashMap<String, Integer> map) {
        System.out.println("\nStudent Records:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    // 🔹 Average
    public static double calculateAverage(HashMap<String, Integer> map) {
        int sum = 0;
        for (int score : map.values()) sum += score;
        return (double) sum / map.size();
    }

    // 🔹 Highest & Lowest
    public static void findHighestLowest(HashMap<String, Integer> map) {
        String maxS = "", minS = "";
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                maxS = e.getKey();
            }
            if (e.getValue() < min) {
                min = e.getValue();
                minS = e.getKey();
            }
        }

        System.out.println("Highest: " + maxS + " (" + max + ")");
        System.out.println("Lowest: " + minS + " (" + min + ")");
    }

    // 🔹 Above average
    public static void studentsAboveAverage(HashMap<String, Integer> map, double avg) {
        System.out.println("\nStudents Above Average:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > avg) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
    }

    // 🏆 Leaderboard + Ranking
    public static void displayLeaderboard(HashMap<String, Integer> map) {
        System.out.println("\n🏆 Leaderboard:");

        // Convert map → list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort descending by score
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        int rank = 1;
        int prevScore = -1;
        int actualRank = 0;

        for (Map.Entry<String, Integer> e : list) {
            actualRank++;

            // Handle ties
            if (e.getValue() != prevScore) {
                rank = actualRank;
            }

            System.out.println("Rank " + rank + ": " + e.getKey() + " (" + e.getValue() + ")");
            prevScore = e.getValue();
        }
    }
}