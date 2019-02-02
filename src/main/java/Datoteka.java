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

        OsnovnaInformacija informacija=new OsnovnaInformacija();
        Zanimanje zanimanje=new Zanimanje();
        int brojElemenataZanimanja=Zanimanje.brojElemenataKlase(zanimanje);
        int brojElemenataOsnovneInformacije=OsnovnaInformacija.brojElemenataKlase(informacija);

        Obrazovanje obrazovanje=new Obrazovanje();
        Obrazovanje obrazovanje2=new Obrazovanje();



        
        HashMap<String,String> mapa=new HashMap<String, String>();
        while (this.ulazniTok.hasNextLine()){

                    String vrijednost=ulazniTok.nextLine();
                    mapa=rastaviKljucVrijednost(vrijednost);
                    postaviVrijednosti(dohvatiVrijednost(mapa),informacija);






            }

        System.out.println(informacija.getImePrezime());
        System.out.println(informacija.getBrojMobitela());
        System.out.println(informacija.getEmailAdresa());
        System.out.println(informacija.getAdresa());
        System.out.println(informacija.getLinkovi());
        System.out.println(zanimanje.getZvanje());
        System.out.println(obrazovanje.getDatumPocetka());
        System.out.println(obrazovanje.getDatumKraja());
        System.out.println(obrazovanje.getTitula());
        System.out.println(obrazovanje.getMjesto());
        System.out.println(obrazovanje.getTehnikeZanimanja());

        System.out.println(obrazovanje2.getDatumPocetka());
        System.out.println(obrazovanje2.getDatumKraja());
        System.out.println(obrazovanje2.getTitula());
        System.out.println(obrazovanje2.getMjesto());
        System.out.println(obrazovanje2.getTehnikeZanimanja());

        }




    public void postaviVrijednosti(String vrijednost,Object o){

          if(o instanceof OsnovnaInformacija){
              if(((OsnovnaInformacija) o).getImePrezime().equals("")){
                  ((OsnovnaInformacija) o).setImePrezime(vrijednost);
              }else if(((OsnovnaInformacija) o).getBrojMobitela().equals("")&&(!((OsnovnaInformacija) o).getImePrezime().equals(""))){
                  ((OsnovnaInformacija) o).setBrojMobitela(vrijednost);
              }else if(((OsnovnaInformacija) o).getEmailAdresa().equals("")&&(!(((OsnovnaInformacija) o).getImePrezime().equals("") && ((OsnovnaInformacija) o).getBrojMobitela().equals("")))){
                  ((OsnovnaInformacija) o).setEmailAdresa(vrijednost);
              }else if(((OsnovnaInformacija) o).getAdresa().equals("")&&(!(((OsnovnaInformacija) o).getImePrezime().equals("")&&(((OsnovnaInformacija) o).getBrojMobitela().equals(""))&&(((OsnovnaInformacija) o).getEmailAdresa().equals(""))))){
                  ((OsnovnaInformacija) o).setAdresa(vrijednost);
              }else if(((OsnovnaInformacija) o).getLinkovi().equals("")&&(!((((OsnovnaInformacija) o).getImePrezime().equals(""))&&(((OsnovnaInformacija) o).getBrojMobitela().equals(""))&&(((OsnovnaInformacija) o).getEmailAdresa().equals(""))&&(((OsnovnaInformacija) o).getAdresa().equals(""))))){
                  ((OsnovnaInformacija) o).setLinkovi(vrijednost);
              }
          }
          if(o instanceof Zanimanje){
              if(((Zanimanje) o).getZvanje().equals("")){
                  ((Zanimanje)o).setZvanje(vrijednost);
              }
          }
          if(o instanceof Obrazovanje){
              if(((Obrazovanje) o).getDatumPocetka().equals("")){
                  ((Obrazovanje) o).setDatumPocetka(vrijednost);
              }else if(((Obrazovanje) o).getDatumKraja().equals("")&&(!((Obrazovanje) o).getDatumPocetka().equals(""))){
                  ((Obrazovanje) o).setDatumKraja(vrijednost);
              }else if(((Obrazovanje) o).getTitula().equals("")&&(!(((Obrazovanje) o).getDatumKraja().equals("")&&(((Obrazovanje) o).getDatumPocetka().equals(""))))){
                  ((Obrazovanje) o).setTitula(vrijednost);
              }else if(((Obrazovanje) o).getMjesto().equals("")&&(!(((Obrazovanje) o).getTitula().equals("")&&((Obrazovanje) o).getDatumKraja().equals("")&&(((Obrazovanje) o).getDatumPocetka().equals(""))))){
                   ((Obrazovanje) o).setMjesto(vrijednost);
              }else if(((Obrazovanje) o).getTehnikeZanimanja().equals("")&&(!(((Obrazovanje) o).getMjesto().equals("")&&((((Obrazovanje) o).getTitula().equals("")&&((Obrazovanje) o).getDatumKraja().equals("")&&(((Obrazovanje) o).getDatumPocetka().equals(""))))))){
                  ((Obrazovanje) o).setTehnikeZanimanja(vrijednost);
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

    public static void preskociLinije(Scanner s,int brojLinija){
        for (int i=0;i<brojLinija;i++){
            if(s.hasNextLine()) s.nextLine();
        }
    }

}
