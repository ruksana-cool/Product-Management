package com.cool.ProductManagement.jpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_transaction_id")
    private int productTransactionId;

    @OneToOne
    @JoinColumn(name="product_id")
    private ProductDetail productDetail;

    @Column(name="product_transaction_status")
    private String productTransactionStatus;

    @Column(name="date_time_created")
    private Date dateTimeCreated;

    @Column(name="date_time_modified")
    private Date dateTimeModified;

    public int getProductTransactionId() {
        return productTransactionId;
    }

    public void setProductTransactionId(int productTransactionId) {
        this.productTransactionId = productTransactionId;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductTransactionStatus() {
        return productTransactionStatus;
    }

    public void setProductTransactionStatus(String productTransactionStatus) {
        this.productTransactionStatus = productTransactionStatus;
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
