package drugo;
import java.util.Scanner;
import java.io.*;

public class Konverzija {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj kilometara");

        float km = scanner.nextFloat();

        System.out.println("Unesite konverzijski faktor");
        
        float faktor = scanner.nextFloat();
        
        int ml = (int)(km/faktor);

        scanner.close();

        if (km<0 || faktor<0){
            if (km < 0) {
                System.out.println("Broj kilometara ne može biti negativan broj!");
            }
            if (faktor < 0){
                System.out.println("Konverzijski faktor ne može biti negativan broj!");
            }     
        }
        else {
            File txt = new File("drugo/konverzijski_faktor.txt");

            FileWriter writer = new FileWriter(txt);
            writer.write("Konverzijski faktor = " + faktor);
            writer.close();

            FileReader reader = new FileReader(txt);
            char[] buffer = new char[30];
            reader.read(buffer);
            reader.close();

            String contents = String.valueOf(buffer);

            System.out.println("Iz datoteke: " + contents);
            System.out.println("Uneseno je " + km + " kilometara, što je " + ml + " milja.");


        }

        
    }
}