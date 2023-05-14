import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number in Meter :- ");
        double m = s.nextDouble();
        
        double f = 3.28084 ;

        double r = f * m ;

        System.out.println("the "+m +" meter value in foot is :- "+r+" foot");
        
        
        s.close();

    }
}
