import java.util.Scanner;

class OddOrEven {
    void main() {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int x = num1.nextInt();
        num1.close();
        
        if (x % 2 == 0) {
            System.out.println("The entered number, " + x + ", is even.");
        }
        else {
            System.out.println("The entered number, " + x + ", is odd.");
        }
    }
}