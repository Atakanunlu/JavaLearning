package part5_Exception;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaş girin");

        try{
            int age = scanner.nextInt();
            if (age > 100){
//                throw new MyException("100 den büyük olamaz yaş.");
                throw new ArithmeticException();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}


class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
