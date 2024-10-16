package pertemuan7;

import java.util.Scanner;

public class AnakAyamNih {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah anak ayam (N): ");
        int N = scanner.nextInt();

        System.out.println("\nLagu Anak Ayam menggunakan for loop:");
        for (int i = N; i > 0; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.\n");

        System.out.println("Lagu Anak Ayam menggunakan while loop:");
        int i = N;
        while (i > 1) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            i--;
        }
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.\n");

        System.out.println("Lagu Anak Ayam menggunakan do-while loop:");
        i = N;
        do {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu tinggal induknya.");
            }
            i--;
        } while (i > 0);
    }
}
