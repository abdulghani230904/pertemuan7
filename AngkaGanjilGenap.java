package pertemuan7;
public class AngkaGanjilGenap {

    public static void main(String[] args) {
        System.out.println("Deret bilangan dari 0 hingga 20:");
        
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Bilangan genap dari 0 hingga 20:");
        int num = 0;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println("\n");

        System.out.println("Bilangan ganjil dari 0 hingga 20:");
        num = 0;
        do {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 20);
    }
}
