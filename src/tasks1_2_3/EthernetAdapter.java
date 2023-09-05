package tasks1_2_3;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    EthernetAdapter(){
    }

    EthernetAdapter(int speed, String mac){
        super();
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "tasks1_2_3.EthernetAdapter{" +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}