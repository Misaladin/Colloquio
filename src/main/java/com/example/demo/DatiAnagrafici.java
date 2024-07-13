package com.example.demo;

import java.time.Period;
import java.time.Year;
import java.util.Date;

public class DatiAnagrafici {

    String Codice_fiscale;
    int Eta;
    String Data_Nascita;

    public DatiAnagrafici() {
    }

    public DatiAnagrafici(String Codice_fiscale, int eta, String data_Nascita) {
        Codice_fiscale = Codice_fiscale;
        Eta = eta;
        Data_Nascita = data_Nascita;
    }
    public String getCodice_fiscale() {
        return Codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        Codice_fiscale = codice_fiscale;
    }


    public String getData_Nascita() {
        return Data_Nascita;
    }

    public void setData_Nascita(String data_Nascita) {


        String AnnoNascita = Codice_fiscale.substring(6, 8);
        String MeseNascita = Codice_fiscale.substring(8, 9);
        String GiornoNascita = Codice_fiscale.substring(9, 11);


        switch(MeseNascita){
            case "A","a":
                MeseNascita = "01"; break;
            case "B","b":
                MeseNascita = "02"; break;
            case "C","c":
                MeseNascita = "03"; break;
            case "D", "d":
                MeseNascita = "04";break;
            case "E", "e":
                MeseNascita = "05"; break;
            case "H", "h":
                MeseNascita = "06"; break;
            case "L", "l":
                MeseNascita = "07"; break;
            case "M", "m":
                MeseNascita = "08"; break;
            case "P", "p":
                MeseNascita = "09"; break;
            case "R", "r":
                MeseNascita = "10"; break;
            case "S", "s":
                MeseNascita = "11";break;
            case "T", "t":
                MeseNascita = "12"; break;


        }


        Data_Nascita = (GiornoNascita+MeseNascita+AnnoNascita);

    }
    public int getEta() {
        return Eta;
    }

    public void setEta(int eta) {
        int etapp;
        int today = Year.now().getValue() ;

        int AnnoNascita = Integer.parseInt(Codice_fiscale.substring(6, 8));

        if (AnnoNascita > 24)
        {
            eta = Integer.parseInt( "19" + AnnoNascita);
            Eta = today-eta;
        } else
        {
            eta = Integer.parseInt("20" + AnnoNascita);
            Eta = today-eta;
        }  if  (AnnoNascita < 10){

            eta = Integer.parseInt("200" + AnnoNascita);
            Eta = today-eta;

        }


    }
}
