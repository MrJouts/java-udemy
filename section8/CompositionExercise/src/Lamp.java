public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRaring) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRaring;
    }

    public void turnOn() {
        System.out.print("Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
