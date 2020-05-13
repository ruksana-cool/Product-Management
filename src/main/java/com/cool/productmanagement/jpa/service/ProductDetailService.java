package com.cool.productmanagement.jpa.service;

import com.cool.productmanagement.jpa.model.ProductAttribute;
import com.cool.productmanagement.jpa.model.ProductDetail;
import com.cool.productmanagement.jpa.model.ProductTransaction;
import com.cool.productmanagement.jpa.repo.ProductAttributeRepository;
import com.cool.productmanagement.jpa.repo.ProductDetailRepository;
import com.cool.productmanagement.jpa.repo.ProductTransactionRepository;
import com.cool.productmanagement.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductDetailService {
    private static final Logger log = LoggerFactory.getLogger(ProductDetailService.class);

    private String CONSTANT_TXN_SUCCESS="Transaction success";
    private String CONSTANT_TXN_FAILED="Transaction failed";

    @Autowired
    ProductDetailRepository productDetailRepository;

    @Autowired
    ProductAttributeRepository productAttributeRepository;

    @Autowired
    ProductTransactionRepository productTransactionRepository;


    public String saveOrUpdateProductDetail(Product product){
        ProductTransaction productTransaction=new ProductTransaction();
      try {
          ProductDetail productDetail=new ProductDetail();
          //productDetail.setProductId(2);
          productDetail.setProductName(product.getProductName());
          productDetail.setProductDescription(product.getProductDescription());
          productDetail.setDateTimeCreated(new Date());
          productDetail.setDateTimeModified(new Date());
          productDetail= productDetailRepository.save(productDetail);
          log.info("###Saved Product Details "+productDetail.toString());

          ProductAttribute productAttribute=new ProductAttribute();
          // productAttribute.setProductAttributeId();
          productAttribute.setProductType(product.getAttributeDetails().getProductType());
          productAttribute.setProductBrandName(product.getAttributeDetails().getProductBrandName());
          productAttribute.setDateTimeCreated(productDetail.getDateTimeCreated());
          productAttribute.setDateTimeModified(new Date());
          productAttribute.setProductDetail(productDetail);
          productAttribute=productAttributeRepository.save(productAttribute);
          log.info("###Saved Product Attribute Details "+productAttribute.toString());



          productTransaction.setDateTimeCreated(productDetail.getDateTimeCreated());
          productTransaction.setDateTimeModified(new Date());
          productTransaction.setProductDetail(productDetail);
          productTransaction.setProductTransactionStatus(CONSTANT_TXN_SUCCESS);

      }
      catch (Exception e){

         productTransaction.setProductTransactionStatus(CONSTANT_TXN_FAILED);
          log.error("Exception occured while saving"+e);

      }
        productTransaction=productTransactionRepository.save(productTransaction);
        log.info("###Saved Product Transaction Details "+productTransaction.toString());
        return productTransaction.getProductTransactionStatus();
    }

    }
