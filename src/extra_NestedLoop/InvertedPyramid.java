package extra_NestedLoop;

public class InvertedPyramid {
    public static void main(String[] args) {


        for (int satir = 5; satir >= 1; satir--){

            for (int bosluk = 1; bosluk <= 5- satir; bosluk++){
                System.out.print(" ");
            }

            for (int yildiz= 1; yildiz <= ( 2 * satir -1); yildiz++){
                System.out.print(" *");
            }

            System.out.println();


        }

        // SOL TARAFTA BOSLUK SAYISI ARTICAK YILDIZ SAYISI AZALICAK VE SİMETRİ SAĞLAMAK İCİN TEK SAYI OLUCAK YILDIZ SAYISI

        // HER SATIR ICIN BOSLUK SAYISI 5 - SATIR
        // HER SATIR ICIN YILDIZ SAYISI 2 * SATIR -1

        // SATIR 1 İCİN (SATIR = 5) BOSLUK = 5 - 5 TEN 0 BOSLUK YILDIZ: 2*5 -1 DEN 9 YILDIZ.

        System.out.println("WITH WHILE");

        int satirr = 7;
        while (satirr >= 1){

            int bosluuk = 1;
            while (bosluuk <= 7 - satirr){
                System.out.print(" ");
                bosluuk++;
            }

            int yildizz = 1;
            while (yildizz <= 2*satirr -1){
                System.out.print(" *");
                yildizz++;
            }

            System.out.println();
            satirr--;


        }

    }
}
