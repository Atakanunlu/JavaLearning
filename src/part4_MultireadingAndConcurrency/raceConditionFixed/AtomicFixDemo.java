package part4_MultireadingAndConcurrency.raceConditionFixed;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicFixDemo {

    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(AtomicFixDemo::incrementManyTimes);
        Thread t2 = new Thread(AtomicFixDemo::incrementManyTimes);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("counter: " + counter.get());


    }

    static void incrementManyTimes(){
        for (int i = 0; i<1_000_000; i++){
            counter.incrementAndGet();
        }
    }

}
// AtomicInteger:
// Lock kullanmadan thread-safe sayaç sağlar.
// CAS (Compare-And-Swap) mekanizmasıyla çalışır.
//
// incrementAndGet():
// 1) değeri okur
// 2) +1 yapar
// 3) RAM'deki eski değer değişmişse işlemi tekrarlar
//
// synchronized vs Atomic:
// synchronized -> blocking, lock tabanlı
// Atomic -> non-blocking, donanımsal, "bu artışı bölünemez tek işlem gibi yap".
