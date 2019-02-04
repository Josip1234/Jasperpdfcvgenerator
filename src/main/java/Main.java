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

        Map parameters = new HashMap();
        parameters.put("imePrezime",informacija.getImePrezime());
        parameters.put("adresa",informacija.getAdresa());
        parameters.put("brojMobitela",informacija.getBrojMobitela());
        parameters.put("emailAdresa",informacija.getEmailAdresa());
        parameters.put("linkovi",informacija.getLinkovi());
        try {
            printFileName =  JasperFillManager.fillReportToFile(
                    sourceFileName, parameters, beanColDataSource);
            if(printFileName != null){
                JasperPrintManager.printReport( printFileName, true);
            }
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
    }






