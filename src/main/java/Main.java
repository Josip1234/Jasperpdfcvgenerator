import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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
                        informacija.setBrojMobitela(s.nextLine());
                        informacija.setEmailAdresa(s.nextLine());
                        informacija.setAdresa(s.nextLine());
                        informacija.setLinkovi(s.nextLine());
                        zanimanje.setZvanje(s.nextLine());
                        obrazovanje.setDatumPocetka(s.nextLine());
                        obrazovanje.setDatumKraja(s.nextLine());
                        obrazovanje.setTitula(s.nextLine());
                        obrazovanje.setMjesto(s.nextLine());
                        obrazovanje.setTehnikeZanimanja(s.nextLine());

                        obrazovanje2.setDatumPocetka(s.nextLine());
                        obrazovanje2.setDatumKraja(s.nextLine());
                        obrazovanje2.setTitula(s.nextLine());
                        obrazovanje2.setMjesto(s.nextLine());
                        obrazovanje2.setTehnikeZanimanja(s.nextLine());

                        osobnaVjestina.setMaterinskiJezik(s.nextLine());
                        osobnaVjestina.setStraniJezici(s.nextLine());
                        osobnaVjestina.setSlusanje(s.nextLine());
                        osobnaVjestina.setCitanje(s.nextLine());
                        osobnaVjestina.setGovornaInterakcija(s.nextLine());
                        osobnaVjestina.setGovornaProdukcija(s.nextLine());
                        osobnaVjestina.setPisanje(s.nextLine());

                        komunikacijskaVjestina.setVjestina(s.nextLine());

                        digitalnaVjestina.setObradaInformacija(s.nextLine());
                        digitalnaVjestina.setKomunikacija(s.nextLine());
                        digitalnaVjestina.setStvaranjeSadrzaja(s.nextLine());
                        digitalnaVjestina.setSigurnost(s.nextLine());
                        digitalnaVjestina.setRjesavanjeProblema(s.nextLine());

                        ostalaVjestina.setVjestine(s.nextLine());

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

                        System.out.println(osobnaVjestina.getMaterinskiJezik());
                        System.out.println(osobnaVjestina.getStraniJezici());
                        System.out.println(osobnaVjestina.getSlusanje());
                        System.out.println(osobnaVjestina.getCitanje());
                        System.out.println(osobnaVjestina.getGovornaInterakcija());
                        System.out.println(osobnaVjestina.getGovornaProdukcija());
                        System.out.println(osobnaVjestina.getPisanje());

                        System.out.println(komunikacijskaVjestina.getVjestina());


                        System.out.println(digitalnaVjestina.getObradaInformacija());
                        System.out.println(digitalnaVjestina.getKomunikacija());
                        System.out.println(digitalnaVjestina.getStvaranjeSadrzaja());
                        System.out.println(digitalnaVjestina.getSigurnost());
                        System.out.println(digitalnaVjestina.getRjesavanjeProblema());

                        System.out.println(ostalaVjestina.getVjestine());



                        break;
                    }
                }catch (Exception e){
                }
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




