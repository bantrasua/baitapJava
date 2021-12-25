public class Main {
    public static void main(String[] args) {
        String str = "You only   live once, but if you do it right, once is enough";
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        char space = ' ';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (space == str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("\nChuoi \""+str+ "\" co %d tu\n", count + 1);




        char kyTuO = 'o';
        int i;
        int dem = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTuO) {
                dem++;
            }
        }
        System.out.print("Ky tu \"o\" xuat hien " + dem + " lan o cac vi tri: ");
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTuO) {
                System.out.printf("%5d",i);
            }
        }
    }
}
