public class MainTask3 {

    public static void main(String[] args) {

        SmartBulb bulb = new SmartBulb();

        bulb.setBrightness(80);
        bulb.turnOn();

        System.out.println(bulb.getStatus());

        bulb.turnOff();

        System.out.println(bulb.getStatus());


        SmartThermostat thermostat = new SmartThermostat();

        thermostat.setTemperature(24.5);
        thermostat.turnOn();

        System.out.println(thermostat.getStatus());

        thermostat.turnOff();

        System.out.println(thermostat.getStatus());
    }
}