import java.util.Scanner;

public class function {
    public static void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban:");
        String ten = scanner.nextLine();

        ten = ten.trim().toLowerCase();
        ten = ten.replaceAll("\\s+", " ");
        String[] tachChuoi = ten.split(" ");
        ten = "";
        for (int i = 0; i < tachChuoi.length; i++) {
            ten += String.valueOf(tachChuoi[i].charAt(0)).toUpperCase() + tachChuoi[i].substring(1);
            if (i < tachChuoi.length - 1) {
                ten += " ";
            }
        }
        System.out.println("Ten cua ban la " + ten);
    }


    public static void ktraChuoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky");
        String str = scanner.nextLine();
        String strNguoc = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            strNguoc += str.charAt(i);
        }
        if (str.equals(strNguoc)) {
            System.out.println("Day la chuoi palindrome");
        } else {
            System.out.println("Day khong phai la chuoi palindrome");
        }
    }   
}
