package com.cool.ProductManagement.jpa.service;

import com.cool.ProductManagement.jpa.repo.ProductAttributeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductAttributeService {
    private static final Logger log = LoggerFactory.getLogger(ProductAttributeService.class);

    @Autowired
    ProductAttributeRepository productAttributeRepository;

}

