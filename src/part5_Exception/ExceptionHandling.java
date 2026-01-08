package part5_Exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
    public static void main(String[] args) {


        int a[] = new int[5];

        System.out.println("Merhaba");


//        try {
//            int result = 5 /0;
//            System.out.println(a[7]);
//
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace());
//            System.out.println(e.toString());
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Olmaz.");
//        }
//        System.out.println("görüşrüz");
//    }
//

    try {
        int result = 5 / 0;
        System.out.println(a[7]);

//    }catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException exception) {
//        System.out.println();
//    } catch (RuntimeException e){
//
//    }
    }catch (Exception e){
        System.out.println("all exception handle ");
    }

        System.out.println("görüşrüz");
}
}
