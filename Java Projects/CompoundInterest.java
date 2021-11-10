import java.lang.Math;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the principle money amount:- ");
        double pr = p.nextDouble();
        p.close();
        
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the compound rate of interest per year:- ");
        double rt = r.nextDouble();
        r.close();
        
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the time in years:- ");
        double tm = t.nextDouble();
        t.close();
        
        double ci = pr * Math.pow((1 + (rt/100)), tm);
        
        System.out.println("So, the interest is:- ₹" + (ci-pr));
        System.out.println("And, the total amount is:- ₹" + ci);
    }
}
