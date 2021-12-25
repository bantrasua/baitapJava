public class Main {
    public static void main(String[] args) {
        System.out.println("Hinh vuong:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Hinh tam giac:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
