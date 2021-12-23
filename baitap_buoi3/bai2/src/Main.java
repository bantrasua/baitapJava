import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nGiai phuong trinh bac nhat ax + b = 0");
        double a, b;
        System.out.print("Nhap a = ");
        a = scanner.nextDouble();
        System.out.print("Nhap b = ");
        b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("\nPhuong trinh co vo so nghiem");
            } else {
                System.out.println("\nPhuong trinh vo nghiem");
            }
        } else {
            System.out.println("\nPhuong trinh " + a + "x + " + b + " = 0 co ngiem duy nhat la x = " + ((-b)/a));
        }
    }
}
