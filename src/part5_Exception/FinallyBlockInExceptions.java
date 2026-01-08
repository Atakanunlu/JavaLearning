package part5_Exception;

public class FinallyBlockInExceptions {
    public static void main(String[] args) {

        int a[] = new int[5];


//        System.out.println("Ben atakan");
//
//        try {
//            System.out.println(a[6]);
//        }catch (Exception e){
//            System.out.println("Exception handled");
//        }finally {
//            System.out.println("soy adım ünlü");
//        }
//
//        System.out.println("24 yaşındayım.");
//    }
        try {
            getNumberFromArray(a);
        }catch (Exception e){
            System.out.println("Exception yakalandı " + e.getMessage());
        }


    }

    static int getNumberFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }
}
