package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Formating Huruf
 *          Huruf Besar Kecil
 */
import java.util.Scanner;

public class Latihan_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("\n====Hasil Formating====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());

        scanner.close();
    }
}