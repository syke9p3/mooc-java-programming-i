import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    GradeManager grades = new GradeManager();

    public UserInterface(Scanner scanner, GradeManager grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) break;
            
            grades.add(input);

        }

        System.out.println("Point average (all): " + grades.average());
        System.out.println("Point average (passing): " + grades.averagePassing());
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribution:\n" + grades.gradeDistribution());
        ;
    }

}
