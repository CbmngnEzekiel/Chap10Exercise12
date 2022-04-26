import java.util.Scanner;

public class GradeBook {
    private int[][] grades;

    public GradeBook(){
        this.grades = new int[12][5];
    }

    public void getGrades(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < this.grades.length; i++){
            sc.reset();

            int grade = 0;

            System.out.print("Enter grade for student " + (i + 1) + ": \n");

            for(int j = 0; j < this.grades[i].length; j++){
                System.out.print("Test " + (j + 1) + ": ");
                grade = sc.nextInt();
                this.grades[i][j] = grade;
                System.out.println();
            }
        }
    }

    public void showGrades(){
        for(int i = 0; i < grades.length; i++){
            String displayGrades = "";

            System.out.println("Student " + (i + 1) + ": ");
            System.out.print("Grades: ");

            for(int j = 0; j < grades[i].length; j++){
                displayGrades += grades[i][j] + ", ";
            }

            displayGrades = displayGrades.substring(0, displayGrades.length() - 2);
            System.out.println(displayGrades + "\n");
        }
    }
    

    public void studentAvg(int studentNumber){
        double total = 0;
        double studentAvg = 0;

        for(int i = 0; i < grades[studentNumber - 1].length; i++){
            total += grades[studentNumber - 1][i];
        }

        studentAvg = total / 5;

        System.out.printf("Average grade for student %d: %.2f\n", studentNumber, studentAvg);
    }

    public void testAvg(int testNumber){
        double total = 0;
        double testAvg = 0;

        for(int i = 0; i < grades.length; i++){
            total += grades[i][testNumber - 1];
        }

        testAvg = total / 12;

        System.out.printf("Average grade for Test ID - %d: %.2f\n", testNumber, testAvg);
    }
}