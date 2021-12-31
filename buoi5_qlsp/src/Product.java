public class Product {
    public int id;
    public String ten;
    public int soLuong;
    public String donVi;
    public long giaNhap, giaBan;
    public int soLuongBan;

    
    @Override
    public String toString() {
        return "Id: " + id + " - Ten sp: "+ten+" - So luong: "+soLuong+" "+donVi+"\nGia nhap: "+giaNhap+" - Gia ban: "+giaBan+" - So luong ban: "+soLuongBan+"\n";
    }


    public Product(int id, String ten, int soLuong, String donVi, long giaNhap, long giaBan, int soLuongBan) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
    }


    
}
