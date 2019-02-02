public class Zanimanje extends OsnovnaInformacija{
    private String zvanje;

    public Zanimanje(){
        this.zvanje="";

    }
    public Zanimanje(String imePrezime, String adresa, String brojMobitela, String emailAdresa, String linkovi, String zvanje) {
        super(imePrezime, adresa, brojMobitela, emailAdresa, linkovi);
        this.zvanje = zvanje;
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    @Override
    public String toString() {
        return "Zanimanje:"+getZvanje();
    }
    public static int brojElemenataKlase(Zanimanje zanimanje){

        return zanimanje.getClass().getDeclaredFields().length;
    }
}
