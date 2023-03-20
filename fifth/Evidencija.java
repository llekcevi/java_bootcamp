package fifth;

import java.util.ArrayList;

public class Evidencija {
    ArrayList<Student> listaStudenata;

    public Evidencija() {

    }

    public void dodajStudenta(Student student) {
        listaStudenata.add(student);
    }

    public Student pretraziPoBrojuIndexa(String brojIndexa) {
        for (Student student : listaStudenata) {
            if (student.getBrojIndexa() == brojIndexa) {
                return student;
            }

        }
        return null;
    }

    public ArrayList<Student> ispisiSveStudente(){
        return listaStudenata;
    }
}
