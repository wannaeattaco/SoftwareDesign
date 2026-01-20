public abstract class PlayerCommand {
    protected Player receiver;

    public PlayerCommand(Player receiver) {
        this.receiver = receiver;
    }
    public abstract void execute();
}