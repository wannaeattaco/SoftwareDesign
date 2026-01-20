public class JumpCommand extends PlayerCommand{
    public JumpCommand(Player receiver){
        super(receiver);
    }
    @Override
    public  void execute(){
        receiver.jump();
    }
}