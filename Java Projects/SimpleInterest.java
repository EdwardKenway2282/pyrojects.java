import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the principle money amount:- ");
        int pr = p.nextInt();
        p.close();
        
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the rate of interest per year:- ");
        int rt = r.nextInt();
        r.close();
        
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the time in years:- ");
        int tm = t.nextInt();
        t.close();
        
        int i = pr * rt * tm / 100;
        int a = i + pr;
        
        System.out.println("So, the interest is:- " + i);
        System.out.println("And, the total amount is:- " + i);
    }
}