//import java.awt.*;
//import java.util.ArrayList;
//import javax.swing.*;
//import java.util.List;
////import java.util.Timer;
//import java.util.TimerTask;
//import java.util.Random;
//
//public class Game extends JFrame{
//    private WorldPanel worldPanel = new WorldPanel();
////    private Monster testMonster = new Monster(100, 100);
//    private List<Monster> monsters = new ArrayList<Monster>();
//
//    private void startSpawningMonsters(){
//        System.out.println("Start spawning monster");
//        java.util.Timer timer = new java.util.Timer();
//        Random random = new Random();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("new monster created");
//                Monster monster = new Monster(random.nextInt(800),
//                        random.nextInt(600));
//                monsters.add(monster);
//                repaint();
//            }
//        }, 0, 1000);
//    }
//
//    public Game(){
//        add(worldPanel); // add from JFrame
//        pack();
//        setResizable(false);
//        setAlwaysOnTop(true);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        startSpawningMonsters();  // called function here !!!
//    }
//
//    class WorldPanel extends JPanel {
//        public WorldPanel(){
//            setPreferredSize(new Dimension(800, 600));
//        }
//
//        @Override
//        protected void paintComponent(Graphics g){
//            super.paintComponent(g);
//            for(Monster m : monsters){
//                g.drawImage(m.getImage(), m.getX(), m.getY(),100, 100, null);
//            }
//        }
//    }
//    public static void main(String[] args){
//        new Game();
//    }
//}
//
//
////
////import javax.imageio.ImageIO;
////import java.awt.*;
////        import java.io.File;
////import java.io.IOException;
////import java.util.Random;
////
////public class Monster {
////    private static Image image;  // we can make this to be public abstract class
////    private int x;
////    private int y;
////
////    public Monster() {
////        if (image == null) {
////            try {
////                image = ImageIO.read(new File("Monster.png"));
////            } catch (IOException e) {
////                System.out.println("Monster.png is not found.");
////            }
//////            this.x = x;
//////            this.y = y;
////        }
////
////        Random random = new Random();
////        x = random.nextInt(800);
////        y = random.nextInt(600);
////
////
////    }
////
////    public Image getImage() {
////        return image;
////    }
////
////    public int getX() {
////        return x;
////    }
////
////    public int getY() {
////        return y;
////    }
////}