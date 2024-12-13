package attestation.CORE;

public class Filter {
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Filter(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    public Filter() {
        this.ram = 0;
        this.hdd = 0;
        this.os = "any";
        this.color = "any";
    }

    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }
    public int getHdd() { return hdd; }
    public void setHdd(int hdd) { this.hdd = hdd; }
    public String getOs() { return os; }
    public void setOs(String os) { this.os = os; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
