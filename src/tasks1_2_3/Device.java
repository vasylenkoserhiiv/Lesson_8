package tasks1_2_3;

import java.util.Objects;

/*
Створити класи:
1) Основний клас tasks1_2_3.Device (manufacturer(String), price(float), serialNumber(String));
2) Сабклас tasks1_2_3.Monitor (resolutionX(int), resolutionY(int)) і tasks1_2_3.EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.

 В обох класах перевизначити метод toString, щоб виведення було наступним:

tasks1_2_3.Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
tasks1_2_3.Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
 */
public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    Device (){
    }

    Device (String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString() {
        return "tasks1_2_3.Device: " +
                "manufacturer =" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        final int prime = 31; // Виберіть певне просте число
        int result = 1;

        // Об'єднайте хеш-коди полів, враховуючи nullable поля
        result = prime * result + Objects.hashCode(manufacturer);
        result = prime * result + Objects.hashCode(price);
        result = prime * result + Objects.hashCode(serialNumber);
        // Додайте інші поля

        return result;
    }
}
