package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {

        
        int skruve = 5;     
        int uzgrieznis = 3;      
        int paplaksne = 1;   

        Scanner scanner = new Scanner(System.in);

        // Lietotāja ievade
        System.out.print("Skrūvju skaits: ");
        int skr = scanner.nextInt();

        System.out.print("Uzgriežņu skaits: ");
        int uzg = scanner.nextInt();

        System.out.print("Paplāksņu skaits: ");
        int pap = scanner.nextInt();

        
        boolean error = false;

        if (uzg < skr) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
            error = true;
        }

        if (pap < uzg * 2) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
            error = true;
        }

        if (!error) {
            System.out.println("Pasūtījums ir kārtībā.");
        }

        
        int total = skr * skruve + uzg * uzgrieznis + pap * paplaksne;
        System.out.println("Kopējā cena: " + total);
    }
}
