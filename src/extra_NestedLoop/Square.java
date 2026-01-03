package extra_NestedLoop;

public class Square {
    public static void main(String[] args) {

        int kenarUzunluk =3;
        for (int i = 1; i<= kenarUzunluk; i++){
            for (int j = 1; j<= kenarUzunluk; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("WITH WHILE");

        int a = 1;
        while (a < 4){

            int b = 1;
            while (b< 4){
                System.out.print(" *");
                b++;
            }
            System.out.println();
            a++;

        }
    }
}
