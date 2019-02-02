public class OstalaVjestina  {
    private String vjestine;

    public OstalaVjestina(){

    }
    public OstalaVjestina( String vjestine) {

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
    public static int brojElemenataKlase(OsobnaVjestina osobnaVjestina){

        return osobnaVjestina.getClass().getDeclaredFields().length;
    }
}
