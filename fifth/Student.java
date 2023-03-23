package fifth;

public class Student extends Osoba{
    
    private int godinaStudija;
    private String brojIndexa;

    // - constructor -
    public Student(String ime, String prezime, int godinaStudija, String brojIndexa) {
        super(ime, prezime);
        this.godinaStudija = godinaStudija;
        this.brojIndexa = brojIndexa;
    }

    // - getters -
    public int getGodinaStudija() {
        return godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    // - setters -
    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
}
