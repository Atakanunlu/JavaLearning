package part4_MultireadingAndConcurrency;

public class SingleThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        task("A");
        task("B");
    }
    static void task(String name) throws InterruptedException{
        for (int i = 1; i<=3 ; i++){
            System.out.println(name + " - step " + i + " | thread=  " + Thread.currentThread().getName());
            Thread.sleep(800);
        }
    }
}

// InterruptedException:
// Thread uyku (sleep) veya bekleme (wait/join) halindeyken başka bir thread tarafından zorla uyandırılırsa oluşur.
// Java bu ihtimali göz ardı etmene izin vermez, ya try-catch ister ya da metotta `throws InterruptedException` ister.

// Thread.currentThread():
// Bu kodu ŞU ANDA hangi thread çalıştırıyor sorusunun cevabıdır.
// Debug ve multi-thread senaryolarında hangi thread’in aktif olduğunu görmek için kullanılır.

// getName():
// Thread'in ismini döndürür.
// main thread -> "main"
// new Thread(...) -> "Thread-0", "Thread-1", ...

// Thread.sleep(300):
// Mevcut thread'i 300 milisaniye boyunca BLOCK eder.
// Thread uyur, CPU'ya iş yaptırmaz, süre dolunca kaldığı satırdan devam eder.
// Uyku sırasında thread interrupt edilirse InterruptedException fırlatılır.

// Single-thread davranışı:
// task("A"); task("B");  -> A tamamen bitmeden B ASLA başlamaz.
// Çünkü ikisi de aynı thread (main) üzerinde sırayla çalışır.
