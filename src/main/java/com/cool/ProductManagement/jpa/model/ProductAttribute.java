package com.cool.ProductManagement.jpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_attribute_id")
    private int productAttributeId;

    @OneToOne
    @JoinColumn(name="product_id")
    private ProductDetail productDetail;

    @Column(name="product_type")
    private String productType;

    @Column(name="product_brand_name")
    private String productBrandName;

    @Column(name="date_time_created")
    private Date dateTimeCreated;

    @Column(name="date_time_modified")
    private Date dateTimeModified;

    public int getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(int productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductBrandName() {
        return productBrandName;
    }

    public void setProductBrandName(String productBrandName) {
        this.productBrandName = productBrandName;
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(Date dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public Date getDateTimeModified() {
        return dateTimeModified;
    }

    public void setDateTimeModified(Date dateTimeModified) {
        this.dateTimeModified = dateTimeModified;
    }
}
