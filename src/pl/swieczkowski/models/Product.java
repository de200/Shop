package pl.swieczkowski.models;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    private double productWeight;
    private String productColor;
    private int productCount;

    public Product(int productId, String productName, double productPrice, double productWeight, String productColor, int productCount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.productColor = productColor;
        this.productCount = productCount;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public String getProductColor() {
        return productColor;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
