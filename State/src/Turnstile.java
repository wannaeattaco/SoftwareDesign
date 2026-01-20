public class Turnstile {
    private State state = new StateLocked();

    public Turnstile(State state){
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void coin() {
        state.coin(this);

    }

    public void push() {
        state.push(this);
    }

}