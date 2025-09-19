import java.util.Scanner;

public class average {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ievadiet Atzīmi: ")
    Double atzime = scanner.nextDouble();
    if (atzime < 0){
        System.out.println("impossible")

    }
    if (atzime <= 49){
        System.out.println("failed")
                
    }
    if (atzime <= 59){
        System.out.println("1")
                
    }
    if (atzime <= 69){
        System.out.println("2")
                
    }
    if (atzime <= 79){
        System.out.println("3")
                
    }
    if (atzime <= 89){
        System.out.println("4")
                
    }
    if (atzime <= 99){
        System.out.println("5")
                
    }
    if (atzime >= 100){
        System.out.println("Incredible")
                
    }
    
    }
}
