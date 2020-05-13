package com.cool.productmanagement.jpa.service;

import com.cool.productmanagement.jpa.model.ProductDetail;
import com.cool.productmanagement.jpa.model.ProductTransaction;
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

    @Autowired
    ProductDetailRepository productDetailRepository;

    @Autowired
    ProductTransactionRepository productTransactionRepository;

    public List<ProductDetail> getAllProductDetail(){
        return (List<ProductDetail>)productDetailRepository.findAll();
    }

    public ProductDetail getProductDetailById(Long id){
        return productDetailRepository.findById(id).get();
    }

    public String saveOrUpdateProductDetail(Product product){
       /* ProductTransaction productTransaction=new ProductTransaction();
        productTransaction.setProductTransactionStatus("success");
        productTransaction.setDateTimeCreated(new Date());
        productTransaction.setDateTimeModified(new Date());
        productTransaction.setProductDetail();
        productDetailRepository.save(productDetail);*/
       ProductDetail productDetail=new ProductDetail();
       productDetail.setProductId(2);
       productDetail.setProductName(product.getProductName());
       productDetail.setProductDescription(product.getProductDescription());
       productDetail.setDateTimeCreated(new Date());
       productDetail.setDateTimeModified(new Date());
       productDetail= productDetailRepository.save(productDetail);
       log.info("### "+productDetail.getProductId());
       return "success";

    }

    public void deleteProductDetail(Long id){
        productDetailRepository.deleteById(id);
    }
    }
