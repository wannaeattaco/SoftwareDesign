public class AttackCommand extends PlayerCommand {
    public AttackCommand(Player receiver) {
        super(receiver);
    }
    @Override
    public void execute(){
        receiver.attack();
    }
}