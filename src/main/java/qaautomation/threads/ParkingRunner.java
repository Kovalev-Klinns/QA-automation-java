package qaautomation.threads;
//Автостоянка. Доступно несколько машиномест. На одном месте может находиться только один автомобиль.
//Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
public class ParkingRunner {
    public static void main(String[] args) {
        try {
            Semaphore semaphore = new Semaphore(3);
            new Thread(new Car("Porsche", semaphore)).start();
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Car("BMW", semaphore)).start();
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Car("Nissan", semaphore)).start();
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Car("Toyota", semaphore)).start();
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Car("Ford", semaphore)).start();
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Car("Chevrolet", semaphore)).start();
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Car("Honda", semaphore)).start();
            TimeUnit.SECONDS.sleep(1);
            new Thread(new Car("Lada Kalina", semaphore)).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

