import java.util.Scanner;

public class compare {
    public static void nhapxuat() {
        Scanner scanner = new Scanner(System.in);

        String chain1, chain2;
        System.out.println("Nhap vao chuoi thu nhat: ");
        chain1 = scanner.nextLine();
        System.out.println("Nhap vao chuoi thu hai: ");
        chain2 = scanner.nextLine();
        equ(chain1, chain2);
        leng(chain1, chain2);
    }

    public static void equ(String chain1, String chain2) {
        String res = (chain1.equalsIgnoreCase(chain2)) ? "\nHai chuoi bang nhau" : "\nHai chuoi khong bang nhau";
        System.out.println(res);
    }

    public static void leng(String chain1, String chain2) {
        String res = (chain1.length() == chain2.length()) ? "Hai chuoi co kich thuoc bang nhau"
                : "Hai chuoi co kich thuoc khac nhau";
        System.out.println(res);        
    }
}