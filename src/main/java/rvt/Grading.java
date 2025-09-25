import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadiet Atzīmi: ");
        double atzime = scanner.nextDouble();
        
        if (atzime < 0) {
            System.out.println("Impossible");
        } else if (atzime <= 49) {
            System.out.println("Failed");
        } else if (atzime <= 59) {
            System.out.println("1");
        } else if (atzime <= 69) {
            System.out.println("2");
        } else if (atzime <= 79) {
            System.out.println("3");
        } else if (atzime <= 89) {
            System.out.println("4");
        } else if (atzime <= 99) {
            System.out.println("5");
        } else if (atzime >= 100) {
            System.out.println("Incredible");
        }
    }
}