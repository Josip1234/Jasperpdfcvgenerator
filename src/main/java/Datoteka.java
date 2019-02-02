import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

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


    
    public void parsirajDatoteku(){
        int index=0;
        OsnovnaInformacija informacija=new OsnovnaInformacija();
        int brojElemenata=OsnovnaInformacija.brojElemenataKlase(informacija);


        
        HashMap<String,String> mapa=new HashMap<String, String>();
        while (this.ulazniTok.hasNextLine()){
            String vrijednost=ulazniTok.nextLine();
            mapa=rastaviKljucVrijednost(vrijednost);
            postaviVrijednosti(dohvatiVrijednost(mapa),informacija);


        }
        System.out.println(informacija.getImePrezime()+" "+informacija.getBrojMobitela()+" "+informacija.getEmailAdresa());

    }
    public void postaviVrijednosti(String vrijednost,Object o){
          if(o instanceof OsnovnaInformacija){
              if(((OsnovnaInformacija) o).getImePrezime().equals("")){
                  ((OsnovnaInformacija) o).setImePrezime(vrijednost);
              }else if(((OsnovnaInformacija) o).getBrojMobitela().equals("")&&(!((OsnovnaInformacija) o).getImePrezime().equals(""))){
                  ((OsnovnaInformacija) o).setBrojMobitela(vrijednost);
              }else if(((OsnovnaInformacija) o).getEmailAdresa().equals("")&&(!(((OsnovnaInformacija) o).getImePrezime().equals("") && ((OsnovnaInformacija) o).getBrojMobitela().equals("")))){
                  ((OsnovnaInformacija) o).setEmailAdresa(vrijednost);
              }


          }
    }
    public String dohvatiVrijednost(HashMap<String,String> map){
        String vrijednost="";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            vrijednost=entry.getValue();
        }

        return vrijednost;
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
