package fifth;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Evidencija e = new Evidencija();
        boolean isTerminated = false;

        Scanner scanner = new Scanner(System.in);

        while (!isTerminated) {
            System.out.println("----------------------");
            System.out.println("Odaberite opciju:");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Pretraži studente po indeksu");
            System.out.println("3. Ispiši sve studente");
            System.out.println("4. Dodaj profesora");
            System.out.println("5. Ispiši sve profesore");
            System.out.println("6. Pretraži profesore po predmetu");
            System.out.println("7. Izlaz");
            System.out.println("----------------------");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    e.dodajStudenta(scanner);
                    break;
                case 2:
                    System.out.println("Upiši broj indeksa: ");
                    String brojIndeksa = scanner.nextLine();
                    e.pretraziPoBrojuIndexa(brojIndeksa);
                    break;
                case 3:
                    e.ispisiSveStudente();
                    break;
                case 4:
                    e.dodajProfesora(scanner);
                    break;
                case 5:
                    e.ispisiSveProfesore();
                    break;
                case 6:
                    System.out.println("Upiši predmet: ");
                    scanner.nextLine();
                    String predmet = scanner.nextLine();
                    e.pretraziProfesorePoPredmetu(predmet);
                    break;
                case 7:
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
