import java.util.Scanner;

public class scores {
    public static void nhapxuat() {
        Scanner scanner = new Scanner(System.in);

        double diemthuchanh, diemlythuyet;
        System.out.println("Nhap diem thuc hanh cua hoc vien: ");
        diemthuchanh = scanner.nextDouble();
        System.out.println("Nhap diem ly thuyet cua hoc vien: ");
        diemlythuyet = scanner.nextDouble();

        System.out.println("Diem trung binh cua hoc vien la: " + dtb(diemthuchanh, diemlythuyet));


        String hocluc;
        hocluc = (dtb(diemthuchanh, diemlythuyet) < 6) ? "TRUOT ROI! AHUHU" : "DAT ROI! AHIHI";
        System.out.println(hocluc);
    }

    public static double dtb(double diemthuchanh, double diemlythuyet) {
        double diemtrungbinh;
        diemtrungbinh = (diemthuchanh + diemlythuyet) / 2;
        return diemtrungbinh;
    }
}