public class PetShop {

    private int distance; // em metros
    private String date; // data passada pelo usuário
    private String name;
    private int qttBigSize;
    protected double priceBigSize;
    private int qttLittleSize;
    private double priceLittleSize;

    public PetShop(int distance, String name, int qttBigSize, double priceBigSize, int qttLittleSize, double priceLittleSize) {
        this.distance = distance;
        this.name = name;
        this.qttBigSize = qttBigSize;
        this.priceBigSize = priceBigSize;
        this.qttLittleSize = qttLittleSize;
        this.priceLittleSize = priceLittleSize;
    }

    public int getDistance() {
        return distance;
    }

    public int getQttBigSize() {
        return qttBigSize;
    }

    public double getPriceBigSize() {
        return priceBigSize;
    }

    public int getQttLittleSize() {
        return qttLittleSize;
    }

    public double getPriceLittleSize() {
        return priceLittleSize;
    }

    public String getName() {
        return name;
    }

    public String getDates() {
        return date;
    }

    public double priceWeekend(double price) {
        return 0;
    }

    public double calculateTotalPrice() {
        return 0;
    }
    
}