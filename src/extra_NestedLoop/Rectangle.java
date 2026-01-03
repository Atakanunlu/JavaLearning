package extra_NestedLoop;

public class Rectangle {
    public static void main(String[] args) {

        for (int satir = 1; satir <= 4; satir++){
            for (int sutun = 1; sutun <= 6; sutun++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("WITH WHILE");
        int i = 1;
        while (i <=4){

            int j = 1;
            while (j <= 6){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;

        }

    }

}
