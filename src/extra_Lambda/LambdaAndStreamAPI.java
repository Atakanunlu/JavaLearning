package extra_Lambda;

public class LambdaAndStreamAPI {
    public static void main(String[] args) {

//        Walkable obj = new WalkFast();
//        obj.walk(4);

//        Walkable obj1 = new Walkable() {
//            @Override
//            public int walk(int steps) {
//                return 0;
//            }
//        };

        Walkable obj = (steps,isEnabled) -> {
            System.out.println(" walking fast + " + steps +" steps" + isEnabled);
            return 2*steps;

        };

        Walkable obj2 = (steps, isEnabled) -> 2*steps;

        obj.walk(8,true);

    }

}


interface Walkable{
    int walk(int steps,boolean isEnabled);
}

//class WalkFast implements Walkable{
//
//    @Override
//    public int walk(int steps) {
//        System.out.println(" walking fast + " + steps +" steps");
//        return 2*steps;
//    }
//}
