package extra_NestedLoop;

public class Diamond {
    public static void main(String[] args) {


        int yukseklik = 7;

        //üst piramit
        for (int satir = 1; satir<= yukseklik; satir++){

            for (int bosluk = 1; bosluk <= yukseklik-satir; bosluk++){
                System.out.print(" ");
            }

            for (int yildiz = 1; yildiz<= (2*satir -1); yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //alt piramit
        for (int satir = yukseklik-1; satir >=1; satir--){

            for (int bosluk = 1; bosluk <= yukseklik -satir; bosluk++){
                System.out.print(" ");
            }

            for (int yildiz = 1; yildiz<= (2* satir - 1); yildiz++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
