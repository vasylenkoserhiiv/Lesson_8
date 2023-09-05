package tasks1_2_3;

/*
tasks1_2_3.Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
tasks1_2_3.Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
 */
public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device device1 = new Device("Samsung!", 120, "AB1234567CD");
        Monitor monitor = new Monitor(1280, 1024);
        Monitor monitor1 = new Monitor(1280, 1024);
        monitor.setManufacturer("Samsung");
        monitor.setPrice(120);
        monitor.setSerialNumber("AB1234567CD");
        monitor1.setManufacturer("Samsung");
        monitor1.setPrice(120);
        monitor1.setSerialNumber("AB1234567CD");

        System.out.println(device);
        System.out.println(monitor);

        System.out.println(device.equals(device1));
        System.out.println(monitor.equals(monitor1));

        System.out.println(device.hashCode());
        System.out.println(device1.hashCode());

        System.out.println(monitor.hashCode());
        System.out.println(monitor1.hashCode());
    }
}
