public class MeuCaninoFeliz extends PetShop {

    public MeuCaninoFeliz(int distance,String name, int qttBigSize, double priceBigSize, int qttLittleSize, double priceLittleSize) {
        super(distance, name, qttBigSize, priceBigSize, qttLittleSize, priceLittleSize);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPriceBigSize() * getQttBigSize()) + (getPriceLittleSize() * getQttLittleSize());
    }
}
