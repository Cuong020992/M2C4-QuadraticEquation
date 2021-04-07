public class QuadraticEquation {
    double a, b, c;
    String pass;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public String getResult() {
        if (getDelta() < 0) {
            return "phương trình vô nghiệm";
        }
        if (getDelta() == 0) {
            return "Phương trình có nghiệm kép: " + String.valueOf(-b / 2 * a);
        }
        double result1 = (-b + Math.sqrt(getDelta())) / (2 * a);
        double result2 = (-b - Math.sqrt(getDelta())) / (2 * a);

        return "\nPhương trình có nghiệm thứ nhất: " + String.valueOf(result1) + "\nPhương trình có nghiệm thứ hai: " + String.valueOf(result2);
    }
}

