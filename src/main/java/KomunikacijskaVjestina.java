public class KomunikacijskaVjestina extends OsnovnaInformacija {
    private String vjestina;

    public KomunikacijskaVjestina(String imePrezime, String adresa, String brojMobitela, String emailAdresa, String linkovi, String vjestina) {
        super(imePrezime, adresa, brojMobitela, emailAdresa, linkovi);
        this.vjestina = vjestina;
    }

    public String getVjestina() {
        return vjestina;
    }

    public void setVjestina(String vjestina) {
        this.vjestina = vjestina;
    }

    @Override
    public String toString() {
        return "KomunikacijskaVjestina{" +
                "vjestina='" + vjestina + '\'' +
                '}';
    }
}
