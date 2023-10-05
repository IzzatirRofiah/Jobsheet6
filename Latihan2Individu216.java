import java.util.Scanner;

public class Latihan2Individu216 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        String  kategori;
        int jumlahBuku, harga, total, bayar;
        double diskon = 0;
        double diskon1 = 0;
        double diskon2 = 0;
       
        System.out.print("Masukkan kategori buku : ");
        kategori = input16.next();
        System.out.print("Masukkan jumlah buku yang dibeli : ");
        jumlahBuku = input16.nextInt();
        System.out.print("Masukkan harga buku : ");
        harga = input16.nextInt();

        if (kategori.equalsIgnoreCase("kamus")){
            if(jumlahBuku > 2){
                diskon = 0.12;
                System.out.println("Anda mendapatkan diskon sebesar 10% dan tambahan 2%");
            }else if (jumlahBuku <= 2){
                diskon = 0.1;
                System.out.println("Anda mendapatkan diskon sebesar 10%");
            }
            total =  (jumlahBuku * harga);
            diskon1= total * diskon;
            bayar = (int) (total- (total * diskon));
             System.out.println("Anda mendapatkan diskon sebanyak: Rp " + diskon1);
            System.out.println("total harga: " + bayar);
        }else if (kategori.equalsIgnoreCase("novel")){
            if ( jumlahBuku > 3){
                diskon = 0.09;
                System.out.println("Anda mendapatkan diskon sebesar 7% dan tambahan 2%");
            }else if (jumlahBuku <= 3){
                diskon = 0.08;
                System.out.println("Anda mendapatkan diskon 8%");
            }
            total = (jumlahBuku * harga);
            diskon2 = total * diskon;
            bayar = (int) (total -(total * diskon));
            System.out.println("Anda mendapatkan diskon sebanyak: Rp " + diskon2);
            System.out.println("total harga: " + bayar);
        }

    }
}