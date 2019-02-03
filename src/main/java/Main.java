import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args)  {


        String sourceFileName = "C:\\Users\\Korisnik\\IdeaProjects\\Jasperpdfcvgenerator\\JaspersoftWorkspace\\Blank_A4_2.jasper";

        DataBeanList DataBeanList = new DataBeanList();
        ArrayList<DataBean> dataList = DataBeanList.getDataBeanList();
        String printFileName = null;
        JRBeanCollectionDataSource beanColDataSource =
                new JRBeanCollectionDataSource(dataList);

        Map parameters = new HashMap();
        /**
         * Passing ReportTitle and Author as parameters
         */
        parameters.put("ReportTitle", "List of Contacts");
        parameters.put("Author", "Prepared By Manisha");

        try {
            printFileName = JasperFillManager.fillReportToFile(
                    sourceFileName, parameters, beanColDataSource);
            if(printFileName != null){
                JasperPrintManager.printReport( printFileName, true);
            }
        } catch (JRException e) {
            e.printStackTrace();
        }
    }




        }




