public class OsnovnaInformacija {
    private String imePrezime;
    private String adresa;
    private String brojMobitela;
    private String emailAdresa;
    private String linkovi;

    public OsnovnaInformacija(String imePrezime, String adresa, String brojMobitela, String emailAdresa, String linkovi) {
        this.imePrezime = imePrezime;
        this.adresa = adresa;
        this.brojMobitela = brojMobitela;
        this.emailAdresa = emailAdresa;
        this.linkovi = linkovi;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
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

    public String getLinkovi() {
        return linkovi;
    }

    public void setLinkovi(String linkovi) {
        this.linkovi = linkovi;
    }

    @Override
    public String toString() {
        return "OsnovnaInformacija{" +
                "imePrezime='" + imePrezime + '\'' +
                ", adresa='" + adresa + '\'' +
                ", brojMobitela='" + brojMobitela + '\'' +
                ", emailAdresa='" + emailAdresa + '\'' +
                ", linkovi='" + linkovi + '\'' +
                '}';
    }
}
