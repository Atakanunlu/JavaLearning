package part4_MultireadingAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(() -> {
            try {
                doWork("A");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        pool.submit(() -> {
            try {
                doWork("B");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        pool.submit(() -> {
            try {
                doWork("C");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        pool.shutdown();
    }
    static void doWork(String name) throws InterruptedException {
        System.out.println(name + " running on " + Thread.currentThread().getName());
        Thread.sleep(800);
    }
}

// ExecutorService:
// Thread yönetimini manuel yapmamızı engeller.
// Thread pool ile hazır thread'leri tekrar kullanır.
//
// newFixedThreadPool(2):
// Aynı anda en fazla 2 iş çalışır.
// Fazla işler kuyrukta bekler.
//
// submit():
// İşi kuyruğa ekler.
// Thread müsaitse hemen çalışır, değilse sırada bekler.
//
// shutdown():
// Yeni iş kabul etme, var olan işleri bitir.

