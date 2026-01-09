package part6_GenericsAndWrapperClasses;

public class WrapperClasses {

    //int,boolean, char, float, byte,long, short,double BUNLAR PRIMITVE DATA TYPE
    // INTEGER,BOOLEAN,CHAR,FLOAT, BYTE,LONG,SHORT,DOUBLE BUNLARDA WRAPPER CLASS TIR

    public static void main(String[] args) {

//        Integer obj = new Integer(12);

        Integer obj2 = Integer.valueOf("12");

        System.out.println(2*obj2);

        Boolean myBoolean = Boolean.getBoolean("false");

        Integer obj3 = 12; // autoboxing

        int age = obj2; //unboxing

    }
}
