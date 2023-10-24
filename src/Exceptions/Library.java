package Exceptions;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3; // Numero di libri da inserire

        Book[] catalog = new Book[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Inserisci i dati per il libro " + (i + 1));
                System.out.print("Titolo: ");
                String title = scanner.nextLine();
                System.out.print("Numero di pagine: ");
                int numPages = Integer.parseInt(scanner.nextLine());
                System.out.print("Autore: ");
                String author = scanner.nextLine();
                System.out.print("Editore: ");
                String publisher = scanner.nextLine();

                catalog[i] = new Book(title, numPages, author, publisher);
            } catch (NumberFormatException e) {
                System.out.println("Errore: Inserire un numero valido per il numero di pagine.");
                i--;
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Catalogo dei libri:");
        for (Book book : catalog) {
            System.out.println(book);
        }
    }
}
