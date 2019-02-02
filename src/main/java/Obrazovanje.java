import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Obrazovanje {
    private String datumPocetka;
    private String datumKraja;
    private String titula;
    private String mjesto;
    private String tehnikeZanimanja;

    public Obrazovanje() {
        this.datumPocetka = "";
        this.datumKraja = "";
        this.titula = "";
        this.mjesto ="";
        this.tehnikeZanimanja="";
    }

    public Obrazovanje(String datumPocetka, String datumKraja, String titula, String mjesto, String tehnikeZanimanja) {

        this.datumPocetka = datumPocetka;
        this.datumKraja = datumKraja;
        this.titula = titula;
        this.mjesto = mjesto;
        this.tehnikeZanimanja = tehnikeZanimanja;
    }

    public String getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(String datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public String getDatumKraja() {
        return datumKraja;
    }

    public void setDatumKraja(String datumKraja) {
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
    public static int brojElemenataKlase(Obrazovanje obrazovanje){

        return obrazovanje.getClass().getDeclaredFields().length;
    }
}
