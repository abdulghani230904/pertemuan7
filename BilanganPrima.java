package pertemuan7;

public class BilanganPrima {

     public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Menggunakan perulangan for:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }

        System.out.println("\nMenggunakan perulangan while:");
        int j = 0;
        while (j <= 20) {
            if (isPrime(j)) {
                System.out.println(j + " adalah bilangan prima");
            } else {
                System.out.println(j + " bukan bilangan prima");
            }
            j++;
        }

        System.out.println("\nMenggunakan perulangan do-while:");
        int k = 0;
        do {
            if (isPrime(k)) {
                System.out.println(k + " adalah bilangan prima");
            } else {
                System.out.println(k + " bukan bilangan prima");
            }
            k++;
        } while (k <= 20);
    }
}
