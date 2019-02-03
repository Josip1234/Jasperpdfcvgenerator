import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPodataka {

    public  OsnovnaInformacija  ucitajPodatkeIzDatoteke(){

        OsnovnaInformacija informacija=new OsnovnaInformacija();
        Zanimanje zanimanje = new Zanimanje();
        Obrazovanje obrazovanje=new Obrazovanje();
        Obrazovanje obrazovanje2=new Obrazovanje();
        OsobnaVjestina osobnaVjestina=new OsobnaVjestina();
        KomunikacijskaVjestina komunikacijskaVjestina=new KomunikacijskaVjestina();
        DigitalnaVjestina digitalnaVjestina=new DigitalnaVjestina();
        OstalaVjestina ostalaVjestina = new OstalaVjestina();

        try {
            Scanner s = new Scanner(new File("properties.config"));


            while (s.hasNextLine()) {

                informacija.setImePrezime(rastaviString(s.nextLine()));
                informacija.setBrojMobitela(rastaviString(s.nextLine()));
                informacija.setEmailAdresa(rastaviString(s.nextLine()));
                informacija.setAdresa(rastaviString(s.nextLine()));
                informacija.setLinkovi(rastaviString(s.nextLine()));
                zanimanje.setZvanje(rastaviString(s.nextLine()));
                obrazovanje.setDatumPocetka(rastaviString(s.nextLine()));
                obrazovanje.setDatumKraja(rastaviString(s.nextLine()));
                obrazovanje.setTitula(rastaviString(s.nextLine()));
                obrazovanje.setMjesto(rastaviString(s.nextLine()));
                obrazovanje.setTehnikeZanimanja(rastaviString(s.nextLine()));

                obrazovanje2.setDatumPocetka(rastaviString(s.nextLine()));
                obrazovanje2.setDatumKraja(rastaviString(s.nextLine()));
                obrazovanje2.setTitula(rastaviString(s.nextLine()));
                obrazovanje2.setMjesto(rastaviString(s.nextLine()));
                obrazovanje2.setTehnikeZanimanja(rastaviString(s.nextLine()));

                osobnaVjestina.setMaterinskiJezik(rastaviString(s.nextLine()));
                osobnaVjestina.setStraniJezici(rastaviString(s.nextLine()));
                osobnaVjestina.setSlusanje(rastaviString(s.nextLine()));
                osobnaVjestina.setCitanje(rastaviString(s.nextLine()));
                osobnaVjestina.setGovornaInterakcija(rastaviString(s.nextLine()));
                osobnaVjestina.setGovornaProdukcija(rastaviString(s.nextLine()));
                osobnaVjestina.setPisanje(rastaviString(s.nextLine()));

                komunikacijskaVjestina.setVjestina(rastaviString(s.nextLine()));

                digitalnaVjestina.setObradaInformacija(rastaviString(s.nextLine()));
                digitalnaVjestina.setKomunikacija(rastaviString(s.nextLine()));
                digitalnaVjestina.setStvaranjeSadrzaja(rastaviString(s.nextLine()));
                digitalnaVjestina.setSigurnost(rastaviString(s.nextLine()));
                digitalnaVjestina.setRjesavanjeProblema(rastaviString(s.nextLine()));

                ostalaVjestina.setVjestine(rastaviString(s.nextLine()));





                break;
            }
        }catch (Exception e){
        }
        return informacija;
    }




    public  ArrayList<OsnovnaInformacija> dohvatiListu() {
        ArrayList<OsnovnaInformacija> objektis = new ArrayList<OsnovnaInformacija>();
        objektis.add(ucitajPodatkeIzDatoteke());
        return objektis;

    }

    public static String  rastaviString(String string){

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

        return vrijednost;
    }
    public static int getPozicijuJednakosti(String vrijednost){
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
