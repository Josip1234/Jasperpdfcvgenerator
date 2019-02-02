public class DigitalnaVjestina {
    private String obradaInformacija;
    private String komunikacija;
    private String stvaranjeSadrzaja;
    private String sigurnost;
    private String rjesavanjeProblema;

    public DigitalnaVjestina() {
    }

    public DigitalnaVjestina( String obradaInformacija, String komunikacija, String stvaranjeSadrzaja, String sigurnost, String rjesavanjeProblema) {

        this.obradaInformacija = obradaInformacija;
        this.komunikacija = komunikacija;
        this.stvaranjeSadrzaja = stvaranjeSadrzaja;
        this.sigurnost = sigurnost;
        this.rjesavanjeProblema = rjesavanjeProblema;
    }

    public String getObradaInformacija() {
        return obradaInformacija;
    }

    public void setObradaInformacija(String obradaInformacija) {
        this.obradaInformacija = obradaInformacija;
    }

    public String getKomunikacija() {
        return komunikacija;
    }

    public void setKomunikacija(String komunikacija) {
        this.komunikacija = komunikacija;
    }

    public String getStvaranjeSadrzaja() {
        return stvaranjeSadrzaja;
    }

    public void setStvaranjeSadrzaja(String stvaranjeSadrzaja) {
        this.stvaranjeSadrzaja = stvaranjeSadrzaja;
    }

    public String getSigurnost() {
        return sigurnost;
    }

    public void setSigurnost(String sigurnost) {
        this.sigurnost = sigurnost;
    }

    public String getRjesavanjeProblema() {
        return rjesavanjeProblema;
    }

    public void setRjesavanjeProblema(String rjesavanjeProblema) {
        this.rjesavanjeProblema = rjesavanjeProblema;
    }

    @Override
    public String toString() {
        return "DigitalnaVjestina{" +
                "obradaInformacija='" + obradaInformacija + '\'' +
                ", komunikacija='" + komunikacija + '\'' +
                ", stvaranjeSadrzaja='" + stvaranjeSadrzaja + '\'' +
                ", sigurnost='" + sigurnost + '\'' +
                ", rjesavanjeProblema='" + rjesavanjeProblema + '\'' +
                '}';
    }

    public static int brojElemenataKlase(DigitalnaVjestina digitalnaVjestina){

        return digitalnaVjestina.getClass().getDeclaredFields().length;
    }
}
