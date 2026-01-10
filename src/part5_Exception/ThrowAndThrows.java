package part5_Exception;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {


//        int age = 15;

//        if (age < 18){
//            throw new IllegalArgumentException("18 yaşından kücükler giremez.");
//        }
//        System.out.println("girebilirsin");
//

        try {
            int age =16;

            if (age < 18){
                throw new IllegalArgumentException("18 yaşından kücükler giremez.");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

//        try {
//            readFile();
//        }catch (Exception e){
//            System.out.println("dosya okunamadı. " + e.getMessage());
//        }

        readFile();

     }
     public static void readFile() throws Exception{

        throw new Exception("dosya bulunmadı.");
     }
}
