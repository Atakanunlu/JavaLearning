package part4_MultireadingAndConcurrency.raceConditionFixed;

public class SynchronizedFixDemo {

    static int counter = 0;
    static private final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(SynchronizedFixDemo::incrementManyTimes);
        Thread t2 = new Thread(SynchronizedFixDemo::incrementManyTimes);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("counter: " + counter);

    }
    public static void incrementManyTimes(){
        for (int i = 0; i < 1_000_000; i++){
            synchronized (lock){
                counter++;
            }
        }
    }
}

// synchronized(lock):
// Aynı anda sadece 1 thread'in bu bloğa girmesine izin verir.
// Bu nesne JVM tarafından monitor (mutex) olarak kullanılır.
//
// counter++ artık atomic hale gelir çünkü:
// read -> increment -> write işlemleri bölünemez.
//
// lock nesnesi ortak olmalı!
// Her thread farklı lock kullanırsa synchronized işe yaramaz.
//
// join():
// Thread’ler bitmeden main thread’in devam etmesini engeller.
// Zamanlama güvenliği sağlar, veri güvenliği değil.

