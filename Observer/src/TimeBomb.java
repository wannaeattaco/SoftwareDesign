public class TimeBomb extends Observable{
    public void startCountDown(){
        new Thread(){
            public void run(){
                for(int tick = 10; tick > 1; tick --){
                    notifyObserver("Tick " + tick);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                notifyObserver("Boom");
            }
        }.start();
    }
}
