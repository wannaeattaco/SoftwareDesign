public class LegacyUnitAdapter implements IUnit {
    private LegacyUnit legacyUnit;

    public LegacyUnitAdapter() {
        this.legacyUnit = new LegacyUnit();
    }

    @Override
    public void move() {
        legacyUnit.walk();
    }

    @Override
    public int getX() {
        return legacyUnit.getPositionX();
    }

    @Override
    public int getY() {
        return legacyUnit.getPositionY();
    }

    @Override
    public String getName() {
        return "Legacy";
    }

    @Override
    public int getHealth() {
        return 999999;
    }

    @Override
    public boolean dead() {
        return false;
    }
}
