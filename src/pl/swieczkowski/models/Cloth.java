package pl.swieczkowski.models;

public class Cloth extends Product {

    private String clothSize;
    private String clothMaterial;

    public Cloth(int productId, String productName, double productPrice, double productWeight, String productColor, int productCount, String clothSize, String clothMaterial) {
        super(productId, productName, productPrice, productWeight, productColor, productCount);
        this.clothSize = clothSize;
        this.clothMaterial = clothMaterial;
    }

    public String getClothSize() {
        return clothSize;
    }

    public String getClothMaterial() {
        return clothMaterial;
    }
}
