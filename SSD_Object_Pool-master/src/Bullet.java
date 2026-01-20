public class Bullet {

    private int x;
    private int y;

    private int dx;
    private int dy;

    private int speed = 10;

    private boolean active;

    public Bullet(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.active = false;
        System.out.println("New Bullet created");
    }

    public void move() {
        if (active) {
            x += dx * speed;
            y += dy * speed;
        }
    }

    public void reset(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        active = false;
    }

    public int getX() { return x; }
    public int getY() { return y; }

}
