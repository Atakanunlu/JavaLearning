package part6_GenericsAndWrapperClasses;

public class GenericMethods {
    public static void main(String[] args) {

        //Sınıf arayüz methodları genel(generic) yaparak farklı TIPLERde çalışabilir hale getiren özelliktir.
        //compile time
        //<T>, <E>, <K,V> gibi

//
//         <T extends ÜstSınıf>  → T, ÜstSınıf veya alt sınıfları olabilir
//
//         NEDEN KULLANILIR?
//         Sadece belirli tiplere izin vermek için
//          O tiplerin metodlarını kullanabilmek için
//
//          <T extends Number>     → Sadece sayı tipleri (Integer, Double...)
//          <T extends Comparable> → Sadece karşılaştırılabilir tipler
//           <T extends Animal>     → Sadece Animal ve alt sınıfları

        System.out.println("Dominguez");
        System.out.println(10);

        GenericMethods obj = new GenericMethods();
        //obj.doubleData("tr");
        obj.doubleData(48);

        CustomClass custom = new CustomClass();
        //obj.doubleData(custom);


    }

    static <E> void printData(E data){
        System.out.println(data);
    }
    <E extends Number> void doubleData(E data){
        System.out.println(data);
    }
}

class CustomClass{

}
