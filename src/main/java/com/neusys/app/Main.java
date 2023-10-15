package com.neusys.app;

import com.neusys.app.ListaPodataka;
import com.neusys.app.OsnovnaInformacija;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws JRException, IOException {
        String sourceFileName = "Blank_A4.jasper";
        ListaPodataka DataBeanList = new ListaPodataka();
        ArrayList<OsnovnaInformacija> dataList = DataBeanList.dohvatiListu();
        OsnovnaInformacija informacija=DataBeanList.ucitajPodatkeIzDatoteke();
        String printFileName = null;
        JRBeanCollectionDataSource beanColDataSource = new
                JRBeanCollectionDataSource(dataList);

        Map<String, Object> parameters = new HashMap();
        parameters.put("imePrezime",informacija.getImePrezime());
        parameters.put("adresa",informacija.getAdresa());
        parameters.put("brojMobitela",informacija.getBrojMobitela());
        parameters.put("emailAdresa",informacija.getEmailAdresa());
        parameters.put("linkovi",informacija.getLinkovi());
        parameters.put("zvanje",informacija.getZvanje());
        parameters.put("datumPočetka",informacija.getDatumPočetka());
        parameters.put("datumZavršetka",informacija.getDatumZavršetka());
        parameters.put("titula",informacija.getTitula());
        parameters.put("mjesto",informacija.getMjesto());
        parameters.put("tehnikeZanimanja",informacija.getTehnikeZanimanja());
        parameters.put("datumPočetka2",informacija.getDatumPocetka2());
        parameters.put("datumZavršetka2",informacija.getDatumZavršetka2());
        parameters.put("titula2",informacija.getTitula2());
        parameters.put("mjesto2",informacija.getMjesto2());
        parameters.put("tehnikeZanimanja2",informacija.getTehnikeZanimanja2());
        parameters.put("ostaleVjestine",DataBeanList.formatirajString(informacija.getOstaleVjestine()));
        parameters.put("materinskiJezik",informacija.getMaterinskiJezik());
        parameters.put("straniJezici",informacija.getStraniJezici());
        parameters.put("slušanje",informacija.getSlušanje());
        parameters.put("čitanje",informacija.getČitanje());
        parameters.put("govornaInterakcija",informacija.getGovornaInterakcija());
        parameters.put("govornaProdukcija",informacija.getGovornaProdukcija());
        parameters.put("pisanje",informacija.getPisanje());
        parameters.put("vjestine",DataBeanList.formatirajString(informacija.getVjestine()));
        parameters.put("obrada",informacija.getObrada());
        parameters.put("komunikacija",informacija.getKomunikacija());
        parameters.put("stvaranjeSadržaja",informacija.getStvaranjeSadržaja());
        parameters.put("sigurnost",informacija.getSigurnost());
        parameters.put("rješavanjeProblema",informacija.getRješavanjeProblema());

        try {
            printFileName =  JasperFillManager.fillReportToFile(
                    sourceFileName, parameters, beanColDataSource);
            if(printFileName != null){

                JasperPrintManager.printReport( printFileName,true);

            }
        } catch (JRException e) {
            e.printStackTrace();
        }

    }
    }






