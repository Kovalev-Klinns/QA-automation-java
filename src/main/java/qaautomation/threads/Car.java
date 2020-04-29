package qaautomation.threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car implements Runnable {
    private String model;
    private Semaphore semaphore;

    public Car(String model, Semaphore semaphore)  {
        this.model = model;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(model + " заезжает на парковку");
        System.out.println(model + " ждет пока не освободится место...");
        try {
        if (semaphore.tryAcquire(7, TimeUnit.SECONDS)) {
            System.out.println("Автомобиль становится на свободное место. " + "(" + model + ")");
            TimeUnit.SECONDS.sleep(20);
            System.out.println(model + " покидает парковочное место.");
            semaphore.release();
        }
        else{
            System.out.println(model + " покидает парковку не дождавшись свободных мест.");
                }
            }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

