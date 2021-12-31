import java.util.Scanner;

public class ProductService {
    public Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten san pham:");
        String ten = scanner.nextLine();
        System.out.println("Nhap so luong san pham:"); 
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap don vi tinh:");   
        String donVi = scanner.nextLine();
        System.out.println("Gia nhap(VND):");
        long giaNhap = scanner.nextLong();
        System.out.println("Gia ban(VND):");
        long giaBan = scanner.nextLong();
        System.out.println("So luong ban:");
        int soLuongBan = scanner.nextInt();

        Product newProduct = new Product(id, ten, soLuong, donVi, giaNhap, giaBan, soLuongBan);
        return newProduct;
    }
    
    public long interest(long giaNhap, long giaBan, int soLuongBan) {
        return ((giaBan - giaNhap) * soLuongBan);
    }
    
    public Product[] addProduct(int n) {
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = createProduct();
        }
        return products;
    }

    public void view(Product[] products) {
        for (Product p : products) {
            System.out.println(p + "---So tien lai(VND): " + interest(p.giaNhap, p.giaBan, p.soLuongBan));
        }
    }
}
