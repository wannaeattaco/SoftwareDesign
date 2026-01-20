public class Main {
    public static void main(String[] args) {
        Turnstile t = new Turnstile(new StateLocked());
        t.push();
        t.push();
        t.coin();
        t.coin();
        t.push();
    }
}