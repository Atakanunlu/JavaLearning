package part4_MultireadingAndConcurrency;

public class MultiThreadDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> runTask("A"),"worker -A");
        Thread t2 = new Thread(() -> runTask("B"),"worker -B");

        t1.start();
        t2.start();

    }
    static void runTask(String name){

        try {
            for (int i =1 ; i <=3; i++){
                System.out.println(name + " - step " + i + " | thread= " + Thread.currentThread().getName());
                Thread.sleep(800);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

// new Thread(...) -> "çalışan" oluşturduk ama daha başlamadı.
// start() -> JVM o thread icin yeni bir akış baslatır.
// Threadler sırayla/karışık yazdırır.(interleaving)
