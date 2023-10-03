import java.util.Scanner;

public class Pemilihan2Percobaan316 {
    public static void main (String[] args) {
        Scanner input16 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input16.nextLine();
        System.out.print("Masukkan besaran penghasilan : ");
        penghasilan = input16.nextInt();
        
        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 0){
                System.out.println("Penghasilan yang anda masukkan tidak valid");
            } else if (penghasilan <= 2000000){
                pajak = 0.1;
            } else if (penghasilan <= 3000000){
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        gajiBersih = (int) (penghasilan - (penghasilan * pajak));
        System.out.println("Gaji bersih yang anda terima : " + gajiBersih);
        } 
        else if (kategori.equals("Pebisnis")){
            if (penghasilan <= 2500000){
                pajak = 0.15;
            } else if (penghasilan <= 3500000){
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
        gajiBersih = (int)(penghasilan - (penghasilan * pajak));
        System.out.println("Gaji bersih yang anda terima : " + gajiBersih);
        } else {
            System.out.println("Kategori yang anda masukkan salah");
        }
    }
}