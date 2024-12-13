package attestation.CORE;

public class Laptop {
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() { return ram; }

    public void setRam(int ram) { this.ram = ram; }

    public int getHdd() { return hdd; }

    public void setHdd(int hdd) { this.hdd = hdd; }

    public String getOs() { return os; }

    public void setOs(String os) { this.os = os; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Ноутбук {" +
                "RAM: " + ram + "|" +
                "HDD :" + hdd + "|" +
                "ОС: " + os + "|" +
                "color: " + color + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        return laptop.ram == ram && laptop.hdd == hdd && laptop.os.equals(os) && laptop.color.equals(color);
    }


    @Override //переопределяем метод hashCode()
    public int hashCode() {
        int result = ram * 13;
        result = 31 * result + hdd * 13;
        result = 31 * result + os.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }
}
