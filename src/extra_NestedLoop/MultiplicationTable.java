package extra_NestedLoop;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            System.out.println("\n " + i +" nin çarpım tablosu");
            for (int j = 1; j<=10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        System.out.println("WITH WHILE");

        int x = 1;
        while (x <= 10){
            System.out.println("\n " + x +" nin çarpım tablosu");


            int y = 1;
            while (y<=10){
                System.out.println(x + " x " + y + " = " + (x * y));
                y++;
            }

            x++;
        }

    }

}
