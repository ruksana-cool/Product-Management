package com.cool.productmanagement.model;

import java.util.List;

public class Product {
    String productName;
    String productDescription;
    AttributeDetails attributeDetails;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public AttributeDetails getAttributeDetails() { return attributeDetails; }

    public void setAttributeDetails(AttributeDetails attributeDetails) { this.attributeDetails = attributeDetails; }

}
