package com.learn.dresscompany;

public class ProductModel {
    String id,productname,productprice,imageurl;

    public ProductModel(){ }

    public ProductModel(String id, String productname, String productprice, String imageurl) {
        this.id = id;
        this.productname = productname;
        this.productprice = productprice;
        this.imageurl = imageurl;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }


}
