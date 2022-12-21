package org.niit.domain;

public class Product {

    private String productName;
    private String productID;
    private String productPrice;
    private String productColor;
    private String productType;

    public Product(String productName, String productID, String productPrice, String productColor, String productType) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
        this.productColor = productColor;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productID='" + productID + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }
}
