package fifth;

public class Student {
    private String ime;
    private String prezime;
    private int godinaStudija;
    private String brojIndexa;

    // - constructor -
    public Student(String ime, String prezime, int godinaStudija, String brojIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaStudija = godinaStudija;
        this.brojIndexa = brojIndexa;
    }

    // - getters -
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    // - setters -
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
}
