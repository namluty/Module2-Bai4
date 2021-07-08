import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation Equation = new QuadraticEquation();
        double a;
        double b;
        double c;
        double x1;
        double x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        Equation.setA(a);
        Equation.setB(b);
        Equation.setC(c);
        x1 = Equation.getRoot1();
        x2 = Equation.getRoot2();
        if (Equation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (Equation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm là: x= " + x1);
        } else {
            System.out.println("Phương trình có 2 nghiệm x1 =" + x1 + "và x2 =" + x2);
        }
    }
}

