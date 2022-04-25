import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        GradeBook gb = new GradeBook();

        gb.getGrades();

        int menuChoice = 0;
        
        do{
            System.out.println("[1] Show grades");
            System.out.println("[2] Student Average");
            System.out.println("[3] Test Average");
            System.out.println("[0] Exit");
            menuChoice = sc.nextInt();

            switch(menuChoice){
                case 1 ->{
                    gb.showGrades();
                }
                case 2 ->{
                    studentAverage(gb);
                }
                case 3 ->{
                    testAverage(gb);
                }
                case 0 ->{

                }
                default ->{
                    System.out.println("Invalid input!");
                }
            }

        }while(menuChoice != 0);

    }

    public static void studentAverage(GradeBook gradebook){
        int studentId = 0;

        System.out.print("Enter student ID: ");
        studentId = sc.nextInt();
        
        gradebook.studentAvg(studentId);

    }

    public static void testAverage(GradeBook gradebook){
        int testId = 0;

        System.out.print("Enter Test ID: ");
        testId = sc.nextInt();
        
        gradebook.testAvg(testId);
    }
    
}
