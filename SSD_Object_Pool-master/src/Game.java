import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Game extends Observable {

    private int width = 600;
    private int height = 600;

    private List<Bullet> bullets;
    private Thread mainLoop;
    private boolean alive;

    public Game() {
        alive = true;
        bullets = new ArrayList<Bullet>();
        mainLoop = new Thread() {
            @Override
            public void run() {
                while(alive) {
                    tick();
                    setChanged();
                    notifyObservers();
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        mainLoop.start();
    }

    public void tick() {
        moveBullets();
        cleanupBullets();
    }

    private void moveBullets() {
        for(Bullet bullet : bullets) {
            bullet.move();
        }
    }


    private void cleanupBullets() {
        for (Bullet bullet : bullets) {
            if (bullet.getX() <= 0 ||
                    bullet.getX() >= width ||
                    bullet.getY() <= 0 ||
                    bullet.getY() >= height) {
                    bullet.deactivate();
            }
        }
        bullets.removeIf(b -> !b.isActive());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<Bullet> getBullets() {
        return bullets;
    }

    public void burstBullets(int x, int y) {
        BulletPool pool = BulletPool.getInstance();

        Bullet b1 = pool.getBullet(x, y, 1, 0);
        Bullet b2 = pool.getBullet(x, y, 0, 1);
        Bullet b3 = pool.getBullet(x, y, -1, 0);
        Bullet b4 = pool.getBullet(x, y, 0, -1);
        Bullet b5 = pool.getBullet(x, y, 1, 1);
        Bullet b6 = pool.getBullet(x, y, 1, -1);
        Bullet b7 = pool.getBullet(x, y, -1, 1);
        Bullet b8 = pool.getBullet(x, y, -1, -1);

        if (b1 != null) bullets.add(b1);
        if (b2 != null) bullets.add(b2);
        if (b3 != null) bullets.add(b3);
        if (b4 != null) bullets.add(b4);
        if (b5 != null) bullets.add(b5);
        if (b6 != null) bullets.add(b6);
        if (b7 != null) bullets.add(b7);
        if (b8 != null) bullets.add(b8);
    }
}
