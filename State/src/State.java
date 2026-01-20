public interface State {
    void push(Turnstile turnstile);
    void coin(Turnstile turnstile);
}
