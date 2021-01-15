package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih;
        detik x = new detik();
        menit y = new menit();

        Scanner input = new Scanner(System.in);
        System.out.println("+----------------+");
        System.out.println("| Time Converter |");
        System.out.println("+----------------+");
        System.out.println("| 1. Detik       |");
        System.out.println("| 2. Menit       |");
        System.out.println("+----------------+");
        System.out.print("Masukan Pilihan : ");
        pilih = input.nextInt();
        if (pilih == 1 ){
            x.timecvt();
        }
        else if (pilih == 2){
            y.timecvt();
        }
        else {
            System.out.println("Error!");
        }
    }
}
