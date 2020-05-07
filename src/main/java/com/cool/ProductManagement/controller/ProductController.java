package com.cool.ProductManagement.controller;


import com.cool.ProductManagement.jpa.model.ProductDetail;
import com.cool.ProductManagement.jpa.service.ProductDetailService;
import com.cool.ProductManagement.model.AttributeDetails;
import com.cool.ProductManagement.model.ProductInsertion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class ProductController {
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductDetailService productDetailService;
    /*@Autowired
    ProductAttributeService productAttributeService;

    @Autowired
    ProductTransactionService productTransactionService;
*/
    //private String methodprfx = "ProductController#";


   /* @PostMapping("/save")
    public ProductDetail save(@RequestBody ProductDetail productDetail){
        productDetailService.saveOrUpdateProductDetail(productDetail);
        return productDetail;
    }
    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String saveName(@RequestParam String abc){
        System.out.println("##########################");
        return "abc";
    }*/

   @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(ProductDetail productDetail) {
       System.out.println("### Name received : "+productDetail.toString());
       return "product Name : "+productDetail.getProductName()+" product description : "+productDetail.getProductDescription();
      /*  productDetailService.saveOrUpdateProductDetail(productDetail);
        return productDetail;*/
    }
}

