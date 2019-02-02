public class OstalaVjestina extends OsnovnaInformacija {
    private String vjestine;

    public OstalaVjestina(String imePrezime, String adresa, String brojMobitela, String emailAdresa, String linkovi, String vjestine) {
        super(imePrezime, adresa, brojMobitela, emailAdresa, linkovi);
        this.vjestine = vjestine;
    }

    public String getVjestine() {
        return vjestine;
    }

    public void setVjestine(String vjestine) {
        this.vjestine = vjestine;
    }

    @Override
    public String toString() {
        return "Ostale Vjestine{" +
                "vjestine='" + vjestine + '\'' +
                '}';
    }
}
