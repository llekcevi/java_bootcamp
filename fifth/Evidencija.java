package fifth;

import java.util.ArrayList;
import java.util.Scanner;

public class Evidencija {
    ArrayList<Student> listaStudenata;

    public Evidencija() {
        listaStudenata = new ArrayList<Student>();
    }

    public void dodajStudenta(Scanner scanner) {

        System.out.println("Unesite ime: ");
        scanner.nextLine();
        String ime = scanner.nextLine();
        System.out.println("Unesite prezime: ");
        String prezime = scanner.nextLine();
        System.out.println("Unesite godinu studija: ");
        int godinaStudija = scanner.nextInt();
        System.out.println("Unesite broj indexa: ");
        String brojIndexa = scanner.next();

        Student student = new Student(ime, prezime, godinaStudija, brojIndexa);
        listaStudenata.add(student);
        System.out.println("Student dodan.");

    }

    public void pretraziPoBrojuIndexa(String brojIndexa) {
        for (Student student : listaStudenata) {
            if (student.getBrojIndexa().equals(brojIndexa)) {
                System.out.println("Student pronađen: " + student.getIme() + " " + student.getPrezime());
            }

        }
    }

    public void ispisiSveStudente() {
        System.out.println("Popis svih studenata: ");

        for (Student student : listaStudenata) {
            System.out.println(student.getIme() + " " + student.getPrezime());
        }
    }
}
