import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap so san pham can quan ly:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ProductService pdService = new ProductService();
        Product[] products = pdService.addProduct(n);
        pdService.view(products);
    }
}
