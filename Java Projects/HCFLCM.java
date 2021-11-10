import java.util.Scanner;

class HCFLCM {
    void main() {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        int x = num1.nextInt();
        num1.close();
        
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the second number:- ");
        int y = num2.nextInt();
        num2.close();
        
        if (x > y) {
            int s = y + 1;
            for (int i = s; i > 1; i--) {
                if (x % i == 0 & y % i == 0) {
                    int hcf = i;
                    System.out.println("The HCF of " + x + " and " + y + " is " + hcf + ".");
                    break;
                }                
            }
        }
        else {
            int s = x + 1;
            for (int i = s; i > 1; i--) {
                if (x % i == 0 & y % i == 0) {
                    int hcf = i;
                    System.out.println("The HCF of " + x + " and " + y + " is " + hcf + ".");
                    break;
                }
            }
        }
        
        int lcm = 0;
        while (true) {
            lcm += 1;
            if (lcm % x == 0 & lcm % y == 0) {
                System.out.println("The LCM of " + x + " and " + y + " is " + lcm + ".");
                break;
            }
        }
    }
}
