import java.util.Scanner;

public class function {

    public static String[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\nNhap thong tin phan tu array[%d]: ", i);
            array[i] = scanner.nextLine();
        }
        return array;
    }
    
    public static void printArray(String[] array) {
        System.out.println("\nMang vua tao la:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "]: " + array[i]);
        }
    }

    public static int countElement(String array[]) {
        int count = 0;
        String jv = "Java";
        for (int i = 0; i < array.length; i++) {
            if (jv.equalsIgnoreCase(array[i])) {
                count++;
            }
        }
        return count;
    }

    public static void find(String array[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap chuoi can tim kiem: ");
        String str = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < array.length; i++) {
            if (str.equalsIgnoreCase(array[i])) {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Chuoi \"" + str +"\" khong co trong mang!");
        } else {
            System.out.print("Chuoi \"" + str + "\" o vi tri: ");
            for (int i = 0; i < array.length; i++) {
                if (str.equalsIgnoreCase(array[i])) {
                    System.out.printf("Array[%d]\t", i);
                }
            }
        }
    }
}
