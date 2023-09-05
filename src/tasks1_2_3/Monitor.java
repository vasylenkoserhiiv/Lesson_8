package tasks1_2_3;

import java.util.Objects;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;
    Monitor(){
    }

    Monitor(int resolutionX, int resolutionY) {
        super();
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }
    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "tasks1_2_3.Monitor: " +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        final int prime = 31; // Виберіть певне просте число
        int result = 1;

        // Об'єднайте хеш-коди полів, враховуючи nullable поля
        result = prime * result + Objects.hashCode(resolutionX);
        result = prime * result + Objects.hashCode(resolutionY);
        // Додайте інші поля

        return result;
    }
}
