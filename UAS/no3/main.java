package no3;

import java.lang.Math;
import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choose = 0;
        while(choose <= 6){
            System.out.println("Pilih Bangun Datar:");
            System.out.println("1. Lingkaran");
            System.out.println("2. BujurSangkar");
            System.out.println("3. LayangLayang");
            System.out.println("4. JajarGenjang");
            System.out.println("5. PersegiPanjang");
            System.out.println("6. Exit");
            System.out.print(">> ");
            choose = sc.nextInt();

            if (choose == 1){
                double r;
                System.out.print("Jari-Jari: ");
                r = sc.nextDouble();
                Lingkaran lingkaran = new Lingkaran(r);
                System.out.printf("Luas Lingkaran = %.3f\n\n", lingkaran.area());
            }else if(choose == 2){
                double s;
                System.out.print("Sisi: ");
                s = sc.nextDouble();
                BujurSangkar persegi = new BujurSangkar(s);
                System.out.printf("Luas Bujur Sangkar = %.3f\n\n", persegi.area());
            }else if(choose == 3) {
                double diagonal1;
                double diagonal2;
                System.out.print("Diagonal 1: ");
                diagonal1 = sc.nextDouble();
                System.out.print("Diagonal 2: ");
                diagonal2 = sc.nextDouble();
                LayangLayang layangan = new LayangLayang(diagonal1, diagonal2);
                System.out.printf("Luas Layang-layang = %.3f\n\n", layangan.area());
            }else if(choose == 4) {
                double alas;
                double tinggi;
                System.out.print("Alas: ");
                alas = sc.nextDouble();
                System.out.print("Tinggi: ");
                tinggi = sc.nextDouble();
                JajarGenjang jajargenjang = new JajarGenjang(alas, tinggi);
                System.out.printf("Luas Jajar Genjang = %.3f\n\n", jajargenjang.area());
            }else if(choose == 5) {
                double panjang;
                double lebar;
                System.out.print("Panjang: ");
                panjang = sc.nextDouble();
                System.out.print("Lebar: ");
                lebar = sc.nextDouble();
                PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                System.out.printf("Luas Persegi Panjang = %.3f\n\n", persegipanjang.area());
            }else{
                break;
            }
        }
    }
}

abstract class BangunDatar {
    double area;
}

class Lingkaran extends BangunDatar {
    double radius;

    Lingkaran(double newRadius){
        radius = newRadius;
    }

    double area() {
        if(radius%7 == 0){
            return area = 22.0 / 7 * radius * radius;
        }else{
            return area = Math.PI * radius * radius;
        }
    }
}

class BujurSangkar extends BangunDatar {
    double sisi;

    BujurSangkar(double newsisi){
        sisi = newsisi;
    }

    double area() {
        return area = (sisi * sisi);
    }
}

class LayangLayang extends BangunDatar {
    double diagonal1;
    double diagonal2;

    LayangLayang(double newDiagonal1, double newDiagonal2){
        diagonal1 = newDiagonal1;
        diagonal2 = newDiagonal2;
    }

    double area() {
        return area = (0.5 * diagonal1 * diagonal2);
    }
}

class JajarGenjang extends BangunDatar {
    double alas;
    double tinggi;

    JajarGenjang(double newalas, double newtinggi){
        alas = newalas;
        tinggi = newtinggi;
    }

    double area() {
        return area = (alas * tinggi);
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    PersegiPanjang(double newpanjang, double newlebar){
        panjang = newpanjang;
        lebar = newlebar;
    }

    double area() {
        return area = (panjang * lebar);
    }
}