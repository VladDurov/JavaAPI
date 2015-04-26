package basic;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BMW extends Car {

    public BMW() {
        model = CarModels.BMW;
    }

    @Override
    public boolean startEngine() {
        if(model == CarModels.BMW){
            System.out.println("BMW start engine");
            playMusic();

            ExecutorService executor = Executors.newFixedThreadPool(5);
            for (int i=0; i<5; i++){

                executor.execute(new Engine(i));
                try {
                    TimeUnit.SECONDS.sleep(7);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            executor.shutdown();
            return true;
        }
        return false;
    }

    @Override
    public void playMusic() {
        System.out.println(getModel());
    }

    @Override
    public void call() {

    }


    class Engine implements Runnable{

        int num;

        public Engine(int n) {
            num = n;
        }

        @Override
        public void run() {
            TimerTask tt = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("TimerTask runnig: " + new GregorianCalendar().get(GregorianCalendar.SECOND));

                }
            };

            Timer timer = new Timer();
            timer.schedule(tt,new Date());

            for(int i=0; i<10; i++){
                System.out.println("NUM: "+num+" run: "+i);



                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
