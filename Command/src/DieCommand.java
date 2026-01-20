public class DieCommand extends PlayerCommand {
    public DieCommand(Player receiver){
        super(receiver);
    }
    @Override
    public  void execute(){
        receiver.jump();
    }
}