package com.cool.ProductManagement.jpa.service;

import com.cool.ProductManagement.jpa.model.ProductDetail;
import com.cool.ProductManagement.jpa.repo.ProductDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailService {
    private static final Logger log = LoggerFactory.getLogger(ProductDetailService.class);

    @Autowired
    ProductDetailRepository productDetailRepository;

    public List<ProductDetail> getAllProductDetail(){
        return (List<ProductDetail>)productDetailRepository.findAll();
    }

    public ProductDetail getProductDetailById(Long id){
        return productDetailRepository.findById(id).get();
    }

    public void saveOrUpdateProductDetail(ProductDetail productDetail){
        productDetailRepository.save(productDetail);
    }

    public void deleteProductDetail(Long id){
        productDetailRepository.deleteById(id);
    }
    }
