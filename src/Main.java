import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = sc.nextDouble();
        System.out.print("Nhập b:");
        double b = sc.nextDouble();
        System.out.print("Nhập c:");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        System.out.println("delta là: "+quadraticEquation.getDelta());
        System.out.println("Kết quả của chương trình: "+quadraticEquation.getResult());
    }
}
