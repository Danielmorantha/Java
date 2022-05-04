package org.Morantha.Permainan;

import com.sun.source.tree.WhileLoopTree;

import java.awt.desktop.AboutEvent;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Selamat datang di permainan");
        System.out.println("Bolehkan saya mengetahui Nama Anda? ");

        Scanner nama = new Scanner(System.in);
        String NmaHasil = nama.next();
        System.out.println("Hello, "+NmaHasil);


        System.out.println("siapkah mulai?");
        System.out.println("\t1. Iya");
        System.out.println("\t2. Tidak");

        int JwbMulai = nama.nextInt();

        while (JwbMulai != 1)
        {
            System.out.println("siapkah mulai?");
            System.out.println("\t1. Iya");
            System.out.println("\t2. Tidak");

            JwbMulai = nama.nextInt();
        }

        Random acak = new Random();
        int x = acak.nextInt( 20 )+1;
        System.out.println("Mohon masukan angka: ");
        int UserInput = nama.nextInt();


        int percobaan = 0;
        boolean menang = false;
        boolean selesai = false;

        while (!selesai)
        {
            percobaan++;
            if (percobaan < 5)
            {
                if (UserInput == x)
                {
                    menang = true;
                    selesai = true;
                } else if (UserInput > x)
                {
                    System.out.println("Angka rendah");
                    UserInput = nama.nextInt();
                }else
                {
                    System.out.println("Angka Tinggi");
                    UserInput = nama.nextInt();
                }
            }else
            {
                selesai = true;
            }
        }


        if (selesai)
        {
            System.out.println("Selamat! anda menang di perocbaan " +percobaan+ " Keren");

        }else
        {
            System.out.println("Permainan berakhir");
            System.out.println("Angka salah : " +x);
        }


    }
}
