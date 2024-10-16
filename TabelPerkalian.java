package pertemuan7;
import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();
        
        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 dan 10.");
            return;
        }

        int maxLength = Integer.toString(n * n).length();
        
        String horizontalLine = "+";
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < maxLength + 2; j++) {
                horizontalLine += "-";
            }
            horizontalLine += "+";
        }

        System.out.println(horizontalLine);
        System.out.print("|    ");  
        for (int i = 1; i <= n; i++) {
            System.out.printf("| %" + maxLength + "d ", i);
        }
        System.out.println("|");
        System.out.println(horizontalLine);

        for (int i = 1; i <= n; i++) {
            System.out.printf("| %" + maxLength + "d ", i);  
            for (int j = 1; j <= n; j++) {
                System.out.printf("| %" + maxLength + "d ", i * j); 
            }
            System.out.println("|");
            System.out.println(horizontalLine);
        }
        
        scanner.close();
    }
}
