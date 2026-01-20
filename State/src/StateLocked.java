public class StateLocked implements State{
    @Override
    public void push(Turnstile turnstile) {
        System.out.println("Pushed when locked. Nothing happened");
    }

    @Override
    public void coin(Turnstile turnstile) {
        System.out.println("Coin when locked becomes unlocked");
        turnstile.setState(new StateUnlocked());

    }
}
