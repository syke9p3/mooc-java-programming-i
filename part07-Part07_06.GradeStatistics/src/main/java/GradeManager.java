import java.util.ArrayList;

public class GradeManager {
    
    private ArrayList<Integer> points;

    public GradeManager() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {
        if (point < 0 || point > 100) return;
        points.add(point);
    }

    public double average() {

        if (points.size() <= 0) return -1;

        int sum = 0;

        for (int point : points) {
            sum += point;
        }

        return 1.0 * sum / points.size();
        
    }

    public String averagePassing() {

        if (points.size() <= 0) return "-";
        
        int sum = 0;
        int passingCount = 0;

        for (int point : points) {
            if (point >= 50) {
                sum += point;
                passingCount++;
            }
        }

        if (passingCount == 0) return "-";

        return "" + (1.0 * sum / passingCount);
    }

    public double passPercentage() {

        int passingCount = 0;

        for (int point : points) {
            if (point >= 50) {
                passingCount++;
            }
        }

        return 100.0 * passingCount / points.size();
    }

    public String gradeDistribution() {

        String string = "";

        int[] grades = new int[6];

        for (int point : points) {
            if (point < 50) grades[0]++;
            else if (point < 60) grades[1]++;
            else if (point < 70) grades[2]++;
            else if (point < 80) grades[3]++;
            else if (point < 90) grades[4]++;
            else if (point >= 90) grades[5]++;
        }

        for (int i = 0; i < grades.length; i++) {
            string += "" + i + ":" + printStars(grades[i]) + "\n"; 
        }

        return string;

        

    }

    private static String printStars(int count) {
        String stars = "";
        for(int i = 1; i <= count; i++) {
            stars += "*";
        }
        return stars;
    }

    
}
