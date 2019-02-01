public class OsobnaInformacija {
    private int id;
    private String imePrezime;
    private String brojMobitela;
    private String emailAdresa;
    private String adresa;
    private String linkovi;

    public OsobnaInformacija(int id, String imePrezime, String brojMobitela, String emailAdresa, String adresa, String linkovi) {
        this.id = id;
        this.imePrezime = imePrezime;
        this.brojMobitela = brojMobitela;
        this.emailAdresa = emailAdresa;
        this.adresa = adresa;
        this.linkovi = linkovi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getBrojMobitela() {
        return brojMobitela;
    }

    public void setBrojMobitela(String brojMobitela) {
        this.brojMobitela = brojMobitela;
    }

    public String getEmailAdresa() {
        return emailAdresa;
    }

    public void setEmailAdresa(String emailAdresa) {
        this.emailAdresa = emailAdresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getLinkovi() {
        return linkovi;
    }

    public void setLinkovi(String linkovi) {
        this.linkovi = linkovi;
    }

    @Override
    public String toString() {
        return "OsobnaInformacija{" +
                "id=" + id +
                ", imePrezime='" + imePrezime + '\'' +
                ", brojMobitela='" + brojMobitela + '\'' +
                ", emailAdresa='" + emailAdresa + '\'' +
                ", adresa='" + adresa + '\'' +
                ", linkovi='" + linkovi + '\'' +
                '}';
    }
}
