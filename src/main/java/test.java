import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Jam Masuk         : ");
        int jamMasuk = s.nextInt();
        System.out.print("Jam Pulang        : ");
        int jamPulang = s.nextInt();
        System.out.print("Jenis kendaraan   : ");
        String jenisKendaraan = s.next();

        int initialPriceMotor = 3000;
        int nextHourepriceMotor = 2000;

        int initialPriceMobil = 5000;
        int nextHourepriceMobil = 4000;

        int totalJam = 0;
        int totalPrice = 0;

        if (jamMasuk>jamPulang){
            totalJam = (jamPulang+24)-jamMasuk;
        } else if (jamPulang>jamMasuk) {
            totalJam = jamPulang-jamMasuk;
        }

        if (jenisKendaraan.equalsIgnoreCase("motor")){
            if (totalJam==0){
                totalPrice = initialPriceMotor;
            } else if (totalJam>0) {
                totalPrice = initialPriceMotor+((totalJam-1)*nextHourepriceMotor);
            }
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")){
            if (totalJam==0){
                totalPrice = initialPriceMobil;
            } else if (totalJam>0) {
                totalPrice = initialPriceMobil+((totalJam-1)*nextHourepriceMobil);
            }
        }
        System.out.println("===Output===");
        System.out.println("Total jam   : "+totalJam);
        System.out.println("Total harga : "+totalPrice);
    }
}
