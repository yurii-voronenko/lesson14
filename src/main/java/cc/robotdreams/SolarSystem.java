package cc.robotdreams;

public enum SolarSystem
{
    MERCURY(0, 100),
    VENUS(100, 200, MERCURY),
    EARTH(100, 200, VENUS),
    ;

    final public int num;
    final public int prevDistance;
    final public int radius;
    final public int sunDistance;
    final public SolarSystem previous;

    private SolarSystem next;

    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.prevDistance = prevDistance;
        this.radius = radius;
        if (previous == null) {
            this.num = 1;
            this.sunDistance = 100;
            this.previous = null;
        } else {
            this.num = previous.num + 1;
            this.sunDistance = previous.sunDistance + prevDistance;
            this.previous = previous;
            this.previous.next = this;
        }
    }

    SolarSystem(int prevDistance, int radius) {
        this(prevDistance, radius, null);
    }
}
