import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Datoteka {
    private Locale lokalizacija;
    private Scanner ulazniTok;
    private FileInputStream ulaznaDatoteka;

    public Datoteka() throws FileNotFoundException {
        this.lokalizacija=new Locale("hr","HR");
        this.ulaznaDatoteka=new FileInputStream("properties.config");
        this.ulazniTok=new Scanner(ulaznaDatoteka,"UTF-8").useLocale(lokalizacija);
    }

    public Locale getLokalizacija() {
        return lokalizacija;
    }

    public void setLokalizacija(Locale lokalizacija) {
        this.lokalizacija = lokalizacija;
    }

    public Scanner getUlazniTok() {
        return ulazniTok;
    }

    public void setUlazniTok(Scanner ulazniTok) {
        this.ulazniTok = ulazniTok;
    }

    public FileInputStream getUlaznaDatoteka() {
        return ulaznaDatoteka;
    }

    public void setUlaznaDatoteka(FileInputStream ulaznaDatoteka) {
        this.ulaznaDatoteka = ulaznaDatoteka;
    }

    public void ispisiDatoteku(){
        while (this.ulazniTok.hasNextLine()){
            String vrijednost1=ulazniTok.nextLine();
            System.out.println(vrijednost1);
        }
        this.ulazniTok.close();
    }

}
