import java.util.ArrayList;

public class GradeStatistics {

    private ArrayList<Integer> pointTotals;

    public GradeStatistics() {
        this.pointTotals = new ArrayList<>();
    }

    public void addScore(int score) {
        if (score < 0 || score > 100) {
            return;
        }

        this.pointTotals.add(score);
    }

    public void print() {
        
        double sum = 0;
        double passSum = 0;
        int numberOfPass = 0;

        for (Integer points : this.pointTotals) {
            sum += points;

            if (points >= 50) {
                passSum += points;
                numberOfPass++;
            }
        }

        System.out.println("Point average (all): " + sum / this.pointTotals.size());
        if (numberOfPass > 0) {
            System.out.println("Point average (passing): " + passSum / numberOfPass);
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + (100.0 * numberOfPass / this.pointTotals.size()));

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + printStars(i));
        }
    }

    private String printStars(int grade) {
        int stars = 0;

        for (Integer score : this.pointTotals) {
            if (convertToGrade(score) == grade) {
                stars++;
            }
        }
        return stars(stars);
    }

    private String stars(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }

    private int convertToGrade(int score) {

        int grade = 5;

        if (score < 50) {
            grade = 0;
        } else if (score < 60) {
            grade = 1;
        } else if (score < 70) {
            grade = 2;
        } else if (score < 80) {
            grade = 3;
        } else if (score < 90) {
            grade = 4;
        }
        return grade;
    }
}
