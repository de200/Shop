package pl.swieczkowski.models;

public class Boots extends Product{
    private int bootsSize;
    private boolean isNaturalSkin;

    public Boots(int productId, String productName, double productPrice, double productWeight, String productColor, int productCount, int bootsSize, boolean isNaturalSkin) {
        super(productId, productName, productPrice, productWeight, productColor, productCount);
        this.bootsSize = bootsSize;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getBootsSize() {
        return bootsSize;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }
}
