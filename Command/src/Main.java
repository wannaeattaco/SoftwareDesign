import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Random random = new Random(42);
        List<PlayerCommand> commands = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            PlayerCommand cmd;
            if (random.nextInt(100) < 50) {
                cmd = new AttackCommand(player);

            } else {
                cmd = new JumpCommand(player);

            }
            cmd.execute();
            commands.add(cmd);
        }

        System.out.println("This is Replay:");
        for (PlayerCommand cmd: commands){
            cmd.execute();
        }

    }
}
//public class Main {
//    public static void main(String[] args) {
//        Player player = new Player();
//        Random random = new Random(42);
//        List<String> actions = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            if (random.nextInt(100) < 50) {
//                player.attack();
//                actions.add("Attack");
//            } else {
//                player.jump();
//                actions.add("Jump");
//            }
//        }
//
//        System.out.println("This is Replay:");
//        for (String action : actions) {
//            System.out.println(action);
//        }
//    }
//}