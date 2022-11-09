import java.util.Scanner;

public class QuesCalculatePercentage {
    public static void main(String[] args) {
        int totalMarks = 100;
        System.out.println("Taking Input from the students");
        Scanner studentMarks = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        int sub1 = studentMarks.nextInt();
        System.out.println("Enter subject 2 marks");
        int sub2 = studentMarks.nextInt();
        System.out.println("Enter subject 3 marks");
        int sub3 = studentMarks.nextInt();
        System.out.println("Enter subject 4 marks");
        int sub4 = studentMarks.nextInt();
        System.out.println("Enter subject 5 marks");
        int sub5 = studentMarks.nextInt();
        float sum =  sub1+sub2+sub3+sub4+sub5;
        float totalPercent = (sum * 100)/(totalMarks*5);
        System.out.println("Total Percentage of student is: " + totalPercent + "%" );


    }
}
