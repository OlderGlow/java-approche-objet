package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);

        Date date = calendar.getTime();
        System.out.println(formateur.format(date));
        Calendar calendar2 = Calendar.getInstance();
        System.out.println(formateur2.format(calendar2.getTime()));

        Locale francais = new Locale("fr", "FR");
        Locale allemand = new Locale("de", "DE");
        Locale russe = new Locale("ru", "RU");
        Locale chinois = new Locale("zh", "CN");

        SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", francais);
        SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", allemand);
        SimpleDateFormat formateur5 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", russe);
        SimpleDateFormat formateur6 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", chinois);

        System.out.println(formateur4.format(calendar2.getTime()));
        System.out.println(formateur3.format(calendar2.getTime()));
        System.out.println(formateur5.format(calendar2.getTime()));
        System.out.println(formateur6.format(calendar2.getTime()));

    }
}
