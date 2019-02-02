public class OsobnaVjestina extends OsnovnaInformacija {
    private String materinskiJezik;
    private String straniJezici;
    private String slusanje;
    private String citanje;
    private String govornaInterakcija;
    private String govornaProdukcija;
    private String pisanje;

    public OsobnaVjestina(String imePrezime, String adresa, String brojMobitela, String emailAdresa, String linkovi, String materinskiJezik, String straniJezici, String slusanje, String citanje, String govornaInterakcija, String govornaProdukcija, String pisanje) {
        super(imePrezime, adresa, brojMobitela, emailAdresa, linkovi);
        this.materinskiJezik = materinskiJezik;
        this.straniJezici = straniJezici;
        this.slusanje = slusanje;
        this.citanje = citanje;
        this.govornaInterakcija = govornaInterakcija;
        this.govornaProdukcija = govornaProdukcija;
        this.pisanje = pisanje;
    }

    public String getMaterinskiJezik() {
        return materinskiJezik;
    }

    public void setMaterinskiJezik(String materinskiJezik) {
        this.materinskiJezik = materinskiJezik;
    }

    public String getStraniJezici() {
        return straniJezici;
    }

    public void setStraniJezici(String straniJezici) {
        this.straniJezici = straniJezici;
    }

    public String getSlusanje() {
        return slusanje;
    }

    public void setSlusanje(String slusanje) {
        this.slusanje = slusanje;
    }

    public String getCitanje() {
        return citanje;
    }

    public void setCitanje(String citanje) {
        this.citanje = citanje;
    }

    public String getGovornaInterakcija() {
        return govornaInterakcija;
    }

    public void setGovornaInterakcija(String govornaInterakcija) {
        this.govornaInterakcija = govornaInterakcija;
    }

    public String getGovornaProdukcija() {
        return govornaProdukcija;
    }

    public void setGovornaProdukcija(String govornaProdukcija) {
        this.govornaProdukcija = govornaProdukcija;
    }

    public String getPisanje() {
        return pisanje;
    }

    public void setPisanje(String pisanje) {
        this.pisanje = pisanje;
    }

    @Override
    public String toString() {
        return "OsobnaVjestina{" +
                "materinskiJezik='" + materinskiJezik + '\'' +
                ", straniJezici='" + straniJezici + '\'' +
                ", slusanje='" + slusanje + '\'' +
                ", citanje='" + citanje + '\'' +
                ", govornaInterakcija='" + govornaInterakcija + '\'' +
                ", govornaProdukcija='" + govornaProdukcija + '\'' +
                ", pisanje='" + pisanje + '\'' +
                '}';
    }
}
