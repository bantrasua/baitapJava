import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int nbrandom = random.nextInt(1000000);
        System.out.println("So ngau nhien la: "+nbrandom);
        if (Ktranguyento.soNguyenTo(nbrandom)) {
            System.out.println(nbrandom+" la so nguyen to");
        } else {
            System.out.println(nbrandom+ " khong phai so nguyen to");
        }

    }
}
