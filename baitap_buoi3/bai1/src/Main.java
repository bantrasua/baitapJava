public class Main {
    public static void main(String[] args) {
        String chuoi;
        chuoi = "You only live once, but if you do it right, once is enough";
        System.out.println("\nChuoi: " + chuoi);
        char kyTuO;
        kyTuO = 'o';
        int dem = 0;
        int i;
        System.out.printf("Ky tu 'o' xuat hien o cac vi tri ");
        for (i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTuO) {
                dem++;
                System.out.printf("%5d",++i); // Theo vị trí thực
            }
        }
        System.out.printf("\nKy tu 'o' xuat hien %d lan trong chuoi ", dem);
    }
}
