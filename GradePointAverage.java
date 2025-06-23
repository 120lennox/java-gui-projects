import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // capturing grade from user
        System.out.print("Enter your grade: ");
        float grade = input.nextFloat();

        if (grade >= 0 && grade <= 39){
            System.out.println(grade + " Fail, GPA: 0.00");
        }

        else if (grade >= 40 && grade <= 49){
            System.out.println(grade + " D, GPA: 1.99");
        }

        else if (grade >= 50 && grade <= 54){
            System.out.println(grade + " C-, GPA: 2.00");
        }

        else if (grade >= 55 && grade <= 59){
            System.out.println(grade + " C, GPA: 2.55");
        }

        else if (grade >= 60 && grade <= 64){
            System.out.println(grade + " C+, GPA: 2.99");
        }

        else if (grade >= 65 && grade <= 69){
            System.out.println(grade + " B, GPA: 3.00");
        }

        else if (grade >= 70 && grade <= 74){
            System.out.println(grade + " B+, GPA: 3.74");
        }

        else if (grade >= 75 && grade <= 84){
            System.out.println(grade + " A, GPA: 3.75");
        }

        else if (grade >= 85 && grade <= 100){
            System.out.println(grade + " A+, GPA: 4.00");
        }

        else{
            System.out.println("Invalid grade");
        }


    }
}
