package com.cool.ProductManagement.model;

import javax.persistence.Column;
import java.util.List;

public class ProductInsertion {
    String productName;
    String productDescription;
    List<AttributeDetails> attributeDetails;

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

    public List<AttributeDetails> getAttributeDetails() {
        return attributeDetails;
    }

    public void setAttributeDetails(List<AttributeDetails> attributeDetails) {
        this.attributeDetails = attributeDetails;
    }
}
