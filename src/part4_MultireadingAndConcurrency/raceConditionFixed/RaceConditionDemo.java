package part4_MultireadingAndConcurrency.raceConditionFixed;

public class RaceConditionDemo {

    static int counter = 0;

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(()->incrementManyTimes(),"t1");
        Thread t2 = new Thread(()-> incrementManyTimes(), "t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("counter = " + counter);

    }


    static void incrementManyTimes(){
        for (int i = 0; i<1_000_000; i++){
            counter++;
        }
    }
}
// Race Condition:
// Aynı paylaşılan veriye (static counter) birden fazla thread aynı anda erişirse,
// işlem sırası belirsiz olur ve sonuç tutarsız çıkar.
//
// counter++ atomic değildir:
// 1) read counter
// 2) increment
// 3) write counter
// İki thread aynı değeri okuyup yazarsa "lost update" olur.
//
// join():
// Thread’lerin bitmesini bekler (erken print’i engeller) ama yarış koşulunu (race condition) engellemez. veri tuturarlılığını çözmez.

// start():
// Yeni bir thread başlatır ama ana thread'i bekletmez.
// main thread yoluna devam eder.

// join():
// main thread'i bu thread bitene kadar BLOKLAR.
// Sonuçların yazdırılmadan önce hazır olmasını garanti eder.

// join yoksa:
// Program thread’ler çalışamadan bitebilir → counter = 0 gibi sonuçlar oluşur.

// start() çalıştırır, join() garanti eder