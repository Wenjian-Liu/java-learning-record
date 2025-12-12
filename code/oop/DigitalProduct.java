package com.itheima.chap03;

public class DigitalProduct extends Product{
    private String secretKey;

    public DigitalProduct(String name, double price, String secretKey) {
        super(name, price);
        this.secretKey = secretKey;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "，密钥：" + "****";
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
