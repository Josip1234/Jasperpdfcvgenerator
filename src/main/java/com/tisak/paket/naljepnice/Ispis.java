package com.tisak.paket.naljepnice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.neusys.app.ListaPodataka;
import com.neusys.app.OsnovnaInformacija;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Ispis {

	public static void main(String[] args) {
        String sourceFileName = "jasper/naljepnica_za_paket.jasper";
        String printFileName = null;


        Map<String, String> parameters = new HashMap<String, String>();
    
       parameters.put("Broj_paketa", "TP10060343918");

  

    }
}



