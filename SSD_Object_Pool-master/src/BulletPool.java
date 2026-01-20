import java.util.ArrayList;
import java.util.List;

public class BulletPool {
    private static BulletPool instance;
    private List<Bullet> bullets;
    private final int POOL_SIZE = 100;

    private BulletPool() {
        bullets = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            bullets.add(new Bullet(0, 0, 0, 0)); // Pre-create bullets
        }
    }

    public static BulletPool getInstance() {
        if (instance == null) {
            instance = new BulletPool();
        }
        return instance;
    }

    public Bullet getBullet(int x, int y, int dx, int dy) {
        for (Bullet bullet : bullets) {
            if (!bullet.isActive()) {
                bullet.reset(x, y, dx, dy);
                return bullet;
            }
        }
        return null;
    }
}
