package fifth;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Evidencija e = new Evidencija();
        boolean isTerminated = false;
    
        Scanner scanner = new Scanner(System.in);

        while (!isTerminated) {

            System.out.println("Odaberite opciju:");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Pretraga po indeksu");
            System.out.println("3. Ispiši sve studente");
            System.out.println("4. Izlaz");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    e.dodajStudenta(scanner);
                    break;
                case 2:
                    System.out.println("Upiši broj indeksa: ");
                    String brojIndeksa = scanner.next();
                    e.pretraziPoBrojuIndexa(brojIndeksa);
                    break;
                case 3:
                    e.ispisiSveStudente();
                    break;
                case 4:
                    isTerminated = true;
                    break;
                default:
                    System.out.println("Došlo je do pogreške");
            }
        }
        System.out.println("Doviđenja");
        scanner.close();
    }
}
