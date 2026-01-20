public class Clock extends Observable{
    private int counter = 0;

    public int getCounter(){
        return counter;
    }

    public void tick(){
        counter++;
    }

    public void start(){
        Thread thread = new Thread() {
            public void run(){
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tick();
                    notifyObserver(counter);
                    System.out.println(counter);
                }
            }
        };
        thread.start();
    }
}