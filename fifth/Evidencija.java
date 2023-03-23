package fifth;

import java.util.ArrayList;
import java.util.Scanner;

public class Evidencija {
    ArrayList<Student> listaStudenata;
    ArrayList<Profesor> listaProfesora;

    public Evidencija() {
        listaStudenata = new ArrayList<Student>();
        listaProfesora = new ArrayList<Profesor>();
    }

    public void dodajProfesora(Scanner scanner){
        System.out.println("Unesite ime: ");
        scanner.nextLine();
        String ime = scanner.nextLine();
        System.out.println("Unesite prezime: ");
        String prezime = scanner.nextLine();
        System.out.println("Unesite predmet: ");
        String predmet = scanner.nextLine();

        Profesor profesor = new Profesor(ime, prezime, predmet);
        listaProfesora.add(profesor);
        System.out.println("Profesor dodan");
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
            } else {
                System.out.println("Ne postoji broj indeksa: " + brojIndexa);
            }
        }
    }

    public void ispisiSveStudente() {
        System.out.println("Popis svih studenata: ");

        for (Student student : listaStudenata) {
            System.out.println(student.getIme() + " " + student.getPrezime());
        }
    }

    public void ispisiSveProfesore() {
        System.out.println("Popis svih profesora: ");

        for (Profesor profesor : listaProfesora) {
            System.out.println(profesor.getIme() + " " + profesor.getPrezime() + " - " + profesor.getPredmet());
        }
    }

    public void pretraziProfesorePoPredmetu(String predmet) {
        for (Profesor profesor : listaProfesora) {
            if (profesor.getPredmet().equals(predmet)) {
                System.out.println("Predmet predaje " + profesor.getIme() + " " + profesor.getPrezime());
            } else {
                System.out.println("Nitko ne predaje navedeni predmet. ");
            }
        }
    }

}
