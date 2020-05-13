package com.cool.productmanagement.controller;


import com.cool.productmanagement.jpa.service.ProductAttributeService;
import com.cool.productmanagement.jpa.service.ProductDetailService;
import com.cool.productmanagement.jpa.service.ProductTransactionService;
import com.cool.productmanagement.model.AttributeDetails;
import com.cool.productmanagement.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class ProductController {
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductDetailService productDetailService;
    @Autowired
    ProductAttributeService productAttributeService;

    @Autowired
    ProductTransactionService productTransactionService;
    
    private String methodprfx = "ProductController#";

    @RequestMapping(value = "/get-product-details",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public String productDetailRequest(@RequestBody Product product){
        log.info(methodprfx+"getProductDetails");
        String productId= productDetailService.saveOrUpdateProductDetail(product);
        System.out.println("### Name received : "+product.toString());
       /* return "product Name : "+product.getProductName()+
                " product description : "+product.getProductDescription()+
                "product type : "+product.getAttributeDetails().getProductType() +
                "product brand : "+product.getAttributeDetails().getProductBrandName();
*/
       return "productId returned  "+productId;
    }
}

