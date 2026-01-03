package extra_NestedLoop;

public class RightTriangle {
    public static void main(String[] args) {

        for (int i = 1; i<= 5; i++){

            for (int j = 1; j <= i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("WITH WHILE");

        int satir = 1;
        while (satir <= 4 ){

            int sutun = 1;
            while (sutun <= satir){
                System.out.print(" *");
                sutun++;
            }

            System.out.println();
            satir++;
        }

    }
}
