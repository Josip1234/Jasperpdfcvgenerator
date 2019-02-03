import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPodataka {

    public  OsnovnaInformacija  ucitajPodatkeIzDatoteke(){

        OsnovnaInformacija informacija=new OsnovnaInformacija();


        try {
            Scanner s = new Scanner(new File("properties.config"));


            while (s.hasNextLine()) {

                informacija.setImePrezime(rastaviString(s.nextLine()));
                informacija.setBrojMobitela(rastaviString(s.nextLine()));
                informacija.setEmailAdresa(rastaviString(s.nextLine()));
                informacija.setAdresa(rastaviString(s.nextLine()));
                informacija.setLinkovi(rastaviString(s.nextLine()));
                informacija.setZvanje(rastaviString(s.nextLine()));
                informacija.setDatumPocetka(rastaviString(s.nextLine()));
                informacija.setDatumKraja(rastaviString(s.nextLine()));
                informacija.setTitula(rastaviString(s.nextLine()));
                informacija.setMjesto(rastaviString(s.nextLine()));
                informacija.setTehnikeZanimanja(rastaviString(s.nextLine()));

                informacija.setDatumPocetka2(rastaviString(s.nextLine()));
                informacija.setDatumKraja2(rastaviString(s.nextLine()));
                informacija.setTitula2(rastaviString(s.nextLine()));
                informacija.setMjesto2(rastaviString(s.nextLine()));
                informacija.setTehnikeZanimanja2(rastaviString(s.nextLine()));

                informacija.setMaterinskiJezik(rastaviString(s.nextLine()));
                informacija.setStraniJezici(rastaviString(s.nextLine()));
                informacija.setSlusanje(rastaviString(s.nextLine()));
                informacija.setCitanje(rastaviString(s.nextLine()));
                informacija.setGovornaInterakcija(rastaviString(s.nextLine()));
                informacija.setGovornaProdukcija(rastaviString(s.nextLine()));
                informacija.setPisanje(rastaviString(s.nextLine()));

                informacija.setVjestina(rastaviString(s.nextLine()));

                informacija.setObradaInformacija(rastaviString(s.nextLine()));
                informacija.setKomunikacija(rastaviString(s.nextLine()));
                informacija.setStvaranjeSadrzaja(rastaviString(s.nextLine()));
                informacija.setSigurnost(rastaviString(s.nextLine()));
                informacija.setRjesavanjeProblema(rastaviString(s.nextLine()));

                informacija.setOstaleVjestine(rastaviString(s.nextLine()));





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
