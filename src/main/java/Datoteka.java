import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Datoteka {
    private Locale lokalizacija;
    private Scanner ulazniTok;
    private FileInputStream ulaznaDatoteka;
    private OsnovnaInformacija osnovnaInformacija;

    public Datoteka() throws FileNotFoundException {
        this.lokalizacija=new Locale("hr","HR");
        this.ulaznaDatoteka=new FileInputStream("properties.config");
        this.ulazniTok=new Scanner(ulaznaDatoteka,"UTF-8").useLocale(lokalizacija);
    }
    public Datoteka(OsnovnaInformacija osnovnaInformacija) throws FileNotFoundException {
        this.lokalizacija=new Locale("hr","HR");
        this.ulaznaDatoteka=new FileInputStream("properties.config");
        this.ulazniTok=new Scanner(ulaznaDatoteka,"UTF-8").useLocale(lokalizacija);
        this.osnovnaInformacija=osnovnaInformacija;
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

    public OsnovnaInformacija getOsnovnaInformacija() {
        return osnovnaInformacija;
    }

    public void setOsnovnaInformacija(OsnovnaInformacija osnovnaInformacija) {
        this.osnovnaInformacija = osnovnaInformacija;
    }

    public void ispisiDatoteku(){
        while (this.ulazniTok.hasNextLine()){
            String vrijednost1=ulazniTok.nextLine();
            System.out.println(vrijednost1);
        }
        this.ulazniTok.close();
    }
    public void parsirajDatoteku(){
        HashMap<String,String> mapa=new HashMap<String, String>();
        while (this.ulazniTok.hasNextLine()){
            String vrijednost=ulazniTok.nextLine();
            mapa=rastaviKljucVrijednost(vrijednost);
        }
        System.out.println(mapa);
    }
    public HashMap<String,String> rastaviKljucVrijednost(String string){
        HashMap<String,String> map=new HashMap<String,String>();
        String kljuc="";
        String vrijednost="";
        int pozicijaStringa=0;
        int pozicijaJednakosti=getPozicijuJednakosti(string);
        for (int i=0;i<string.length();i++){
            pozicijaStringa=i;
            if(pozicijaStringa<pozicijaJednakosti){
                kljuc+=string.charAt(i);
            }else if(pozicijaStringa>pozicijaJednakosti){
                vrijednost+=string.charAt(i);
            }




        }
        map.put(kljuc,vrijednost);
        return map;
    }
    public void ispisiVrijednostiMape(HashMap<String,String> mapa){
        System.out.println(mapa);
    }
    public int getPozicijuJednakosti(String vrijednost){
        int broj=0;
        for (int i=0;i<vrijednost.length();i++){
            if(vrijednost.charAt(i)=='='){
                broj=i;
                break;
            }
        }
        return broj;
    }
}
