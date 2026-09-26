public class SmartBulb implements SmartDevice {

    private boolean on;
    private int brightness;

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public String getStatus() {
        if (on) {
            return "Smart Bulb is ON, Brightness: " + brightness;
        } else {
            return "Smart Bulb is OFF";
        }
    }

    public void setBrightness(int level) {

        if (level >= 0 && level <= 100) {
            brightness = level;
        } else {
            System.out.println("Brightness must be between 0 and 100.");
        }
    }
}