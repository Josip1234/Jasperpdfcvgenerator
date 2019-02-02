import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Obrazovanje extends OsnovnaInformacija {
    private Date datumPocetka;
    private Date datumKraja;
    private String titula;
    private String mjesto;
    private String tehnikeZanimanja;

    public Obrazovanje(String imePrezime, String adresa, String brojMobitela, String emailAdresa, String linkovi, Date datumPocetka, Date datumKraja, String titula, String mjesto, String tehnikeZanimanja) {
        super(imePrezime, adresa, brojMobitela, emailAdresa, linkovi);
        this.datumPocetka = datumPocetka;
        this.datumKraja = datumKraja;
        this.titula = titula;
        this.mjesto = mjesto;
        this.tehnikeZanimanja = tehnikeZanimanja;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumKraja() {
        return datumKraja;
    }

    public void setDatumKraja(Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public String getTehnikeZanimanja() {
        return tehnikeZanimanja;
    }

    public void setTehnikeZanimanja(String tehnikeZanimanja) {
        this.tehnikeZanimanja = tehnikeZanimanja;
    }

    public void parseDate(String date1, String date2) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setDatumPocetka(format.parse(date1));
            setDatumKraja(format.parse(date2));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Obrazovanje{" +
                "datumPocetka=" + datumPocetka +
                ", datumKraja=" + datumKraja +
                ", titula='" + titula + '\'' +
                ", mjesto='" + mjesto + '\'' +
                ", tehnikeZanimanja='" + tehnikeZanimanja + '\'' +
                '}';
    }
}
