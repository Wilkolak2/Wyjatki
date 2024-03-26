import java.io.IOException;
import java.nio.file.Path;
import java.util.IllegalFormatException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(Path.of("test.txt"));
//        int[] tab = {1,2,3};
//        for (int i=0; i<10; i++){
//            System.out.println(tab[i]);
//        }
//        StosWyjatkow stosWyjatkow = new StosWyjatkow();
//        try {
//            stosWyjatkow.metoda1();
//        }catch (IllegalFormatException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println("aha");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        String LiczbaString = scanner.nextLine();
        try{
            int liczba = Integer.parseInt(LiczbaString);
        }catch (NumberFormatException e){
            System.out.println("To nie jest liczba");
        }

    }
}