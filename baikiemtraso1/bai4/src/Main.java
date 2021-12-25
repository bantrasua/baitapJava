public class Main {
    public static void main(String[] args) {
        int dem = 0;
        int n = 10;
        int i = 2;
        System.out.print("10 so nguyen to dau tien la: ");
        while (dem < n) {
            if (soNguyenTo(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }

        System.out.print("\nCac so nguyen to nho hon 10 la: ");
        for (i = 2; i < n; i++) {
            if (soNguyenTo(i)) {
                System.out.print(i+" ");
            }
        }
        

    }


    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
