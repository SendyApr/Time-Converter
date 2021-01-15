package com.company;

import java.util.Scanner;

public class menit extends waktu implements konversi{

    Scanner input = new Scanner(System.in);
    public void timecvt(){
        System.out.println("Konversi Menit");
        System.out.print("Masukan Menit : "); menit = input.nextInt();
        if (menit >= 60 ){
            jam = menit / 60;
            menit = menit - (60*jam);
            System.out.println("Hasil " + jam + ":" + menit + ":00");
        }
        else {
            System.out.println("Hasil 00:" + menit + ":00");
        }
    }

}
