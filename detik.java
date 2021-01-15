package com.company;

import java.util.Scanner;

public class detik extends waktu implements konversi{

    Scanner input = new Scanner(System.in);
    public void timecvt(){
        System.out.println("Konversi Detik");
        System.out.print("Masukan Detik : "); detik = input.nextInt();
        if (detik >= 3600 ){
            jam = detik / 3600;
            detik = detik - (3600*jam);
            menit = detik / 60;
            detik = detik - (60*menit);
            System.out.println("Hasil " + jam + ":" + menit + ":" + detik);
        }
        else if (detik >=60 && detik < 3600){
            menit = detik / 60;
            detik = detik - (60*menit);
            System.out.println("Hasil 00:" + menit + ":" + detik);
        }
        else {
            System.out.println("Hasil 00:00:" + detik);
        }

    }

}

