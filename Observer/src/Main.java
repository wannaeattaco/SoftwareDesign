public class Main {
    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.addObserver(new Window());
//        clock.addObserver(new Window());
//        clock.addObserver(new Window());
//        clock.addObserver(new Window());
//        clock.addObserver(new Window());
//        clock.addObserver(new Console());
//        clock.addObserver(new Console());
//        clock.start();
        TimeBomb tb = new TimeBomb();
        tb.addObserver(new Window());
        tb.addObserver(new Console());
        tb.startCountDown();
    }
}