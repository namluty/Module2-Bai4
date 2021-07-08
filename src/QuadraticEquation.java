public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return -1;
        }
        double delta = Math.sqrt(this.getDiscriminant());
        double x = (-b + delta) / (2 * a);
        return x;
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return -1;
        }
        double delta = Math.sqrt(this.getDiscriminant());
        double x = (-b - delta) / (2 * a);
        return x;
    }

}