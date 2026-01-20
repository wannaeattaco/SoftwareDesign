public class StateUnlocked implements  State{
    @Override
    public void push(Turnstile turnstile) {
        System.out.println("Pushed when unlocked. Person passed. Becomes locked");
        turnstile.setState(new StateLocked());

    }

    @Override
    public void coin(Turnstile turnstile) {
        System.out.println("Coin when unlocked. Nothing happened");

    }
}
