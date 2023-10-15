package com.neusys.app;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPodataka {


    public OsnovnaInformacija ucitajPodatkeIzDatoteke(){

        OsnovnaInformacija informacija=new OsnovnaInformacija();


        try {
            Scanner s = new Scanner(new File("properties.conf"));


            while (s.hasNextLine()) {

                informacija.setImePrezime(rastaviString(s.nextLine()));
                informacija.setBrojMobitela(rastaviString(s.nextLine()));
                informacija.setEmailAdresa(rastaviString(s.nextLine()));
                informacija.setAdresa(rastaviString(s.nextLine()));
                informacija.setLinkovi(rastaviString(s.nextLine()));
                informacija.setZvanje(rastaviString(s.nextLine()));
                informacija.setDatumPočetka(rastaviString(s.nextLine()));
                informacija.setDatumZavršetka(rastaviString(s.nextLine()));
                informacija.setTitula(rastaviString(s.nextLine()));
                informacija.setMjesto(rastaviString(s.nextLine()));
                informacija.setTehnikeZanimanja(rastaviString(s.nextLine()));

                informacija.setDatumPocetka2(rastaviString(s.nextLine()));
                informacija.setDatumZavršetka2(rastaviString(s.nextLine()));
                informacija.setTitula2(rastaviString(s.nextLine()));
                informacija.setMjesto2(rastaviString(s.nextLine()));
                informacija.setTehnikeZanimanja2(rastaviString(s.nextLine()));

                informacija.setMaterinskiJezik(rastaviString(s.nextLine()));
                informacija.setStraniJezici(rastaviString(s.nextLine()));
                informacija.setSlušanje(rastaviString(s.nextLine()));
                informacija.setČitanje(rastaviString(s.nextLine()));
                informacija.setGovornaInterakcija(rastaviString(s.nextLine()));
                informacija.setGovornaProdukcija(rastaviString(s.nextLine()));
                informacija.setPisanje(rastaviString(s.nextLine()));

                informacija.setVjestine(rastaviString(s.nextLine()));

                informacija.setObrada(rastaviString(s.nextLine()));
                informacija.setKomunikacija(rastaviString(s.nextLine()));
                informacija.setStvaranjeSadržaja(rastaviString(s.nextLine()));
                informacija.setSigurnost(rastaviString(s.nextLine()));
                informacija.setRješavanjeProblema(rastaviString(s.nextLine()));

                informacija.setOstaleVjestine(rastaviString(s.nextLine()));





                break;
            }
        }catch (Exception e){
        }
        return informacija;
    }

    public String formatirajString(String original){
    	System.out.println(original);
        String noviString="";

        char razmak='-';
        for (int i=0;i<original.length();i++){

            if(original.charAt(i)==razmak){
              noviString+="\n";
              noviString+="-";

            }else{
                noviString+=original.charAt(i);
            }
        }
        return noviString;
    }



    public  ArrayList<OsnovnaInformacija> dohvatiListu() {
        ListaPodataka listaPodataka=new ListaPodataka();
        ArrayList<OsnovnaInformacija> objektis = new ArrayList<OsnovnaInformacija>();
        OsnovnaInformacija informacija=listaPodataka.ucitajPodatkeIzDatoteke();

        objektis.add(ucitajPodatke(informacija.getImePrezime(),informacija.getAdresa(),informacija.getBrojMobitela(),informacija.getEmailAdresa(),informacija.getLinkovi(),informacija.getZvanje(),informacija.getDatumPočetka(),informacija.getDatumZavršetka(),informacija.getTitula(),informacija.getMjesto(),informacija.getTehnikeZanimanja(),informacija.getDatumPocetka2(),informacija.getDatumZavršetka2(),informacija.getTitula2(),informacija.getMjesto2(),informacija.getTehnikeZanimanja2(),informacija.getOstaleVjestine(),informacija.getMaterinskiJezik(),
                informacija.getStraniJezici(),informacija.getSlušanje(),informacija.getČitanje(),informacija.getGovornaInterakcija(),
                informacija.getGovornaProdukcija(),informacija.getPisanje(),informacija.getVjestine(),informacija.getObrada(),informacija.getKomunikacija(),
                informacija.getStvaranjeSadržaja(),informacija.getSigurnost(),informacija.getRješavanjeProblema(),informacija));
        return objektis;

    }

    private OsnovnaInformacija ucitajPodatke(String imePrezime, String adresa, String brojMobitela, String emailAdresa, String linkovi, String zvanje, String datumPočetka, String datumZavršetka, String titula, String mjesto, String tehnikeZanimanja, String datumPocetka2, String datumZavršetka2, String titula2, String mjesto2, String tehnikeZanimanja2, String ostaleVjestine, String materinskiJezik, String straniJezici,
                                             String slušanje, String čitanje, String govornaInterakcija, String govornaProdukcija,
                                             String pisanje, String vjestine, String obrada, String komunikacija, String stvaranjeSadržaja, String sigurnost,
                                             String rješavanjeProblema, OsnovnaInformacija informacija){

           informacija.setImePrezime(imePrezime);
           informacija.setAdresa(adresa);
           informacija.setBrojMobitela(brojMobitela);
           informacija.setEmailAdresa(emailAdresa);
           informacija.setLinkovi(linkovi);
           informacija.setZvanje(zvanje);
           informacija.setDatumPočetka(datumPočetka);
           informacija.setDatumZavršetka(datumZavršetka);
           informacija.setTitula(titula);
           informacija.setMjesto(mjesto);
           informacija.setTehnikeZanimanja(tehnikeZanimanja);
           informacija.setDatumPocetka2(datumPocetka2);
           informacija.setDatumZavršetka2(datumZavršetka2);
           informacija.setTitula2(titula2);
           informacija.setMjesto2(mjesto2);
           informacija.setTehnikeZanimanja2(tehnikeZanimanja2);
           informacija.setOstaleVjestine(ostaleVjestine);
           informacija.setMaterinskiJezik(materinskiJezik);
           informacija.setStraniJezici(straniJezici);
           informacija.setSlušanje(slušanje);
           informacija.setČitanje(čitanje);
           informacija.setGovornaInterakcija(govornaInterakcija);
           informacija.setGovornaProdukcija(govornaProdukcija);
           informacija.setPisanje(pisanje);
           informacija.setVjestine(vjestine);
           informacija.setObrada(obrada);
           informacija.setKomunikacija(komunikacija);
           informacija.setStvaranjeSadržaja(stvaranjeSadržaja);
           informacija.setSigurnost(sigurnost);
           informacija.setRješavanjeProblema(rješavanjeProblema);
           return  informacija;
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
