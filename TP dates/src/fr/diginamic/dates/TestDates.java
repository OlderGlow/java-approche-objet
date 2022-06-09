package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) throws ParseException {
         // Afficher la date du jour sous format dd/mm/yyyy
        Date date = new Date();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formateur.format(date));
        String date2 = "19/05/2016 23:59:30";
        Date date3 = formateur2.parse(date2);
        System.out.println(date3);
        Date date4 = new Date();
        System.out.println(formateur2.format(date4));

    }
}
