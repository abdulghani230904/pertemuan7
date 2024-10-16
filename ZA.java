package pertemuan7;

public class ZA {

    public static void main(String[] args) {
        // Menampilkan huruf Z sampai A menggunakan for loop
        System.out.println("Huruf Z sampai A (for loop):");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println("\n");

        // Menampilkan huruf Z sampai A menggunakan while loop
        System.out.println("Huruf Z sampai A (while loop):");
        char ch = 'Z';
        while (ch >= 'A') {
            System.out.print(ch + " ");
            ch--;
        }
        System.out.println("\n");

        // Menampilkan huruf Z sampai A menggunakan do-while loop
        System.out.println("Huruf Z sampai A (do-while loop):");
        ch = 'Z';
        do {
            System.out.print(ch + " ");
            ch--;
        } while (ch >= 'A');
        System.out.println();
    }
}
