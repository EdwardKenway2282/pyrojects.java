import java.util.Scanner;

class Pass {
    void main() {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the percentage of the student:- ");
        int perc = p.nextInt();
        p.close();
        
        if (perc > 50) {
            System.out.println("The student has successfully passed.");
        }
        else {
            System.out.println("The student has successfully passed.");
        }
    }
}