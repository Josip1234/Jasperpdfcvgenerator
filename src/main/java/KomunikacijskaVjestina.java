public class KomunikacijskaVjestina {
    private String vjestina;

    public KomunikacijskaVjestina() {
    }

    public KomunikacijskaVjestina(String vjestina) {

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
    public static int brojElemenataKlase(KomunikacijskaVjestina komunikacijskaVjestina){

        return komunikacijskaVjestina.getClass().getDeclaredFields().length;
    }
}
